package com.ut.scf.core.aop;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ut.scf.core.dict.ScfConsts;
import com.ut.scf.core.util.ReflectUtils;
import com.ut.scf.core.util.ScfBizUtil;

/**
 * 自动添加四个默认字段的值
 * 
 * @author shenying
 *
 */
@Component
@Aspect
public class MybatisMapperSetterAop {

	private static final Logger log = LoggerFactory.getLogger(MybatisMapperSetterAop.class);

	@Autowired
	private HttpSession httpSession;

	@Around(value = "execution(public * com.ut.scf.dao.auto..*.insert*(..)) || execution(public * com.ut.scf.dao.auto..*.update*(..))")
	public Object process(ProceedingJoinPoint point) throws Throwable {
		Object[] args = point.getArgs();

		try {
			Object pojo = args[0];
			Method method = MethodSignature.class.cast(point.getSignature()).getMethod();
			// 非web登录时取不到登录用户ID则为匿名
			String userId = "anon";
			try {
				userId = (String) httpSession.getAttribute(ScfConsts.SESSION_USER_ID);
			} catch (Exception e) {
			}

			Date now = new Date();
			if (method.getName().startsWith("insert")) {
				ScfBizUtil.overwriteNullValue(pojo, ScfConsts.CREATEUSER, userId);
				ScfBizUtil.overwriteNullValue(pojo, ScfConsts.CREATETIME, now);

				Field stsFld = ReflectUtils.getDeclaredField(pojo, ScfConsts.STATUS);
				if (stsFld != null) {
					if (stsFld.getType().equals(Short.class)) {
						ReflectUtils.setFieldValue(pojo, stsFld, (short) 1);
					} else if (stsFld.getType().equals(Integer.class)) {
						ReflectUtils.setFieldValue(pojo, stsFld, 1);
					}
				}
			}

			ScfBizUtil.overwriteNullValue(pojo, ScfConsts.UPDATEUSER, userId);
			ScfBizUtil.overwriteNullValue(pojo, ScfConsts.UPDATETIME, now);
		} catch (Exception e) {
			log.warn("MybatisMapperSetterAop set default FOUR error", e);
		}
		return point.proceed(args);
	}
}
