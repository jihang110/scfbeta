package com.ut.scf.core.util;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author shenying
 *
 */
public class SpringContextUtil {

	private static final WebApplicationContext ctx = ContextLoader.getCurrentWebApplicationContext();

	public static final <T> T getBean(String name, Class<T> type) {
		return ctx.getBean(name, type);
	}

	public static final <T> T getBean(Class<T> type) {
		return ctx.getBean(type);
	}
}
