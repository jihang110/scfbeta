package com.ut.scf.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.activiti.engine.ActivitiException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ut.scf.core.dict.ErrorCodeEnum;
import com.ut.scf.core.exception.BizException;
import com.ut.scf.respbean.BaseRespBean;

/**
 * json控制类的基类，用于异常处理。
 * 
 * @author sunll
 * 
 */
public class BaseJsonController {

	protected final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	protected HttpServletRequest request;

	protected HttpSession getSession(){
		return request.getSession();
	}
	
	protected void setSessionAttribute(String key, Object object) {
		getSession().setAttribute(key, object);
	}

	protected Object getSessionAttribute(String key) {
		return getSession().getAttribute(key);
	}

	protected void removeSessionAttribute(String key) {
		getSession().removeAttribute(key);
	}
	
	/**
	 * 异常处理
	 * 
	 * @param e
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	public @ResponseBody BaseRespBean exceptionHandler(Exception e) {
		BaseRespBean respBean = new BaseRespBean();

		if (e instanceof BizException) {
			log.error(e.getMessage(), e);
			respBean.setResult(((BizException) e).getErrorCodeEnum());

		} else if (e instanceof HttpMessageNotReadableException) {
			log.error(e.getMessage(), e);
			respBean.setResult(ErrorCodeEnum.REQUEST_FORMAT_ERROR);

		} else if (e instanceof MethodArgumentNotValidException) {
			respBean.setResult(ErrorCodeEnum.PARAM_VALID_ERROR);
			respBean.setResultErrorMap(((MethodArgumentNotValidException) e).getBindingResult());

		} else if (e instanceof ActivitiException) {
			respBean.setResult(ErrorCodeEnum.BPM_ERROR);
			respBean.setResultNote(((ActivitiException) e).getMessage());
			
		} else {
			log.error(e.getMessage(), e);
			respBean.setResult(ErrorCodeEnum.FAILED);
		}

		return respBean;
	}

}
