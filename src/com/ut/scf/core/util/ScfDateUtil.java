package com.ut.scf.core.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ut.scf.core.dict.ScfConsts;

/**
 * 日期工具类
 * 
 * @author sunll
 *
 */
public class ScfDateUtil {

	private static final Logger log = LoggerFactory
			.getLogger(ScfDateUtil.class);

	/**
	 * 从字符串中解析时间
	 * @param dateStr
	 * @return
	 */
	public static Date parseDate(String dateStr) {
		try {
			return DateUtils.parseDate(dateStr, ScfConsts.DATE_FORMAT_PATTERNS);
		} catch (Exception e) {
			log.error("Exception : ", e);
			return null;
		}
	}

	/**
	 * 格式化时间
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String format(Date date, String pattern) {
		if (date == null || StringUtils.isBlank(pattern)) {
			return null;
		}
		return DateFormatUtils.format(date, pattern);
	}

	/**
	 * 得到前一天的日期字符串
	 * @return
	 */
	public static String getBeforeDateStr() {
		return format(DateUtils.addDays(Calendar.getInstance().getTime(), -1), ScfConsts.DATE_FORMAT);
	}
	
	/**
	 * 根据指定格式格式化日期,默认为yyyy-MM-dd
	 * @param date
	 * @return
	 */
	public static String parseDate(Date date) {
		return parseDate(date,"yyyy-MM-dd");
	}
	
	/**
	 * 根据指定格式格式化日期
	 * @param date
	 * @param format
	 * @return
	 */
	public static String parseDate(Date date,String format) {
		SimpleDateFormat df = new SimpleDateFormat(format);
		String str = df.format(date);
		return str;
	}

	/**
	 *  计算两个日期之间的差值例如"1.1"到"1.5"算四天
	 * @param fromDate
	 * @param toDate
	 * @return
	 */
	public static int getDays(Date fromDate, Date toDate) {
		if (fromDate == null)
			return 0;
		if (toDate == null)
			return 0;
		long dateTimes = (long) (toDate.getTime() - fromDate.getTime());
		int days = new Long(dateTimes / 1000 / 60 / 60 / 24).intValue();
		return days;
	}
	
	/**
	 * 日期加上指定年份后的日期
	 * @param year
	 * @return
	 */
	public static String dateAddYear(int year){
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, year);
		Date date = calendar.getTime();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String str = df.format(date);
		return str;
	}
	
	/**
	 * 日期加上指定月份后的日期
	 */
	public static String dateAddMoth(Date date,int month){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, month);
		Date newDate = calendar.getTime();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String str = df.format(newDate);
		return str;
	}	
	
	/**
	 * 判断date1是否在date2之前
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static boolean isBefore(Date date1,Date date2){
		return date1.before(date2);
	}
	
	
}
