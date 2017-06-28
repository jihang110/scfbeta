package com.ut.scf.core.util;

import java.util.UUID;

/**
 * Java生成32主键方式
 * 
 * @author sunll
 *
 */
public final class ScfUUID {

	/**
	 * 获得一个UUID
	 * 
	 * @return String UUID
	 */
	public static String generate() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	/**
	 * 获得指定数目的UUID
	 * 
	 * @param number
	 *            int 需要获得的UUID数量
	 * @return String[] UUID数组
	 */
	public static String[] generate(int number) {
		if (number < 1) {
			return null;
		}
		String[] ss = new String[number];
		for (int i = 0; i < number; i++) {
			ss[i] = generate();
		}
		return ss;
	}
}
