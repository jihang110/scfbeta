package com.ut.scf.web.interceptor;

import java.io.StringWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ut.scf.core.dict.ErrorCodeEnum;
import com.ut.scf.core.dict.ScfConsts;
import com.ut.scf.core.util.JsonUtil;
import com.ut.scf.core.util.ScfUUID;
import com.ut.scf.pojo.auto.SysBizLog;
import com.ut.scf.pojo.auto.SysFuncInterface;
import com.ut.scf.reqbean.BaseReqBean;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.service.sys.UserOperService;
import com.ut.scf.sys.ScfCacheDict;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * 业务日志拦截器
 * 
 * @author sunll
 */
@Component
@Aspect
public class BizLogInterceptor {

	private static final Logger log = LoggerFactory.getLogger(BizLogInterceptor.class);

	@Autowired
	private HttpSession httpSession;

	@Autowired
	private HttpServletRequest request;

	@Resource
	private UserOperService userOperService;

	/**
	 * Around 手动控制调用核心业务逻辑，以及调用前和调用后的处理, 注意：当核心业务抛异常后，立即退出，转向AfterAdvice
	 * 执行完AfterAdvice，再转到ThrowingAdvice
	 * 
	 * @param pjp
	 * @return
	 * @throws Throwable
	 */
	@Around(value = "init()")
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		Object[] args = pjp.getArgs();
		Object reqBean = null;
		for (Object object : args) {
			if (object instanceof BaseReqBean) {
				log.info("<-----REQUEST-----> {}", JsonUtil.writeValueAsString(object));
				reqBean = object;
			}
		}

		// 调用核心逻辑
		Object retVal = pjp.proceed();
		if (retVal instanceof BaseRespBean) {
			log.info("<-----RESPONSE-----> {}", JsonUtil.writeValueAsString(retVal));

			// 登陆日志
			if (((BaseRespBean) retVal).getResult() == ErrorCodeEnum.SUCCESS.getValue()) {
				String userId = (String) httpSession.getAttribute(ScfConsts.SESSION_USER_ID);
				String interfaceId = getInterfaceId(request);
				SysFuncInterface interFace = ScfCacheDict.interfaceMap.get(interfaceId);

				if (StringUtils.isNotBlank(userId) && interFace != null
						&& StringUtils.isNotEmpty(interFace.getLogTemplate())) {
					String time = DateFormatUtils.format(Calendar.getInstance().getTime(), ScfConsts.DATETIME_FORMAT);
					String userName = (String) httpSession.getAttribute(ScfConsts.SESSION_USERNAME);
					String ip = request.getRemoteAddr();

					// 替换日志模板
					StringTemplateLoader strLoader = new StringTemplateLoader();
					strLoader.putTemplate("callLogTemplate", interFace.getLogTemplate());
					Configuration config = new Configuration();
					config.setTemplateLoader(strLoader);
					Template template = config.getTemplate("callLogTemplate", "UTF-8");

					Map<String, Object> root = new HashMap<>();
					root.put("reqBean", reqBean);
					root.put("respBean", retVal);
					root.put("callTime", time);
					root.put("operUserId", userId);
					root.put("operUserName", userName);
					StringWriter out = new StringWriter();
					template.process(root, out);
					String content = out.toString();

					// 保存日志记录
					SysBizLog sysBizLog = new SysBizLog();
					sysBizLog.setLogId(ScfUUID.generate());
					sysBizLog.setUserId(userId);
					sysBizLog.setInterfaceId(interfaceId);
					sysBizLog.setIp(ip);
					sysBizLog.setContent(content);
					sysBizLog.setOperTime(new Date());
					log.debug("logParamMap : {}", sysBizLog);
					userOperService.insertBizLog(sysBizLog);
				}
			}
		}

		return retVal;
	};

	private String getInterfaceId(HttpServletRequest request) {
		String cxt = request.getContextPath();
		String uri = request.getRequestURI();
		return StringUtils.substringAfter(uri, cxt) + "_" + request.getMethod();
	}

	/**
	 * Pointcut 定义Pointcut，Pointcut的名称为init()，此方法没有返回值和参数 该方法就是一个标识，不进行调用
	 */
	@Pointcut("execution(public * com.ut.scf.web.controller..*.*(..))")
	private void init() {
	}

}
