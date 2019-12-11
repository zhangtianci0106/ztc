package Mdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import java.time.temporal.TemporalAdjusters;


/**
 * LocalDate ���� LocalTime ʱ�� LocalDateTime ���ں�ʱ��
 * 
 */
public class DateUtils {
	/**
	 * 根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
	 */
	public static String getDateByMonthInit(String date) {
		// 每月的最后一天
		LocalDate monthOfLastDate = LocalDate.parse(date).with(TemporalAdjusters.firstDayOfMonth());
		return monthOfLastDate.toString() + " " + LocalDateTime.MIN.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
	}
	/**
	 *  获得某天最大时间 2017-10-15 23:59:59
	 * @param date
	 * @return
	 */
	public static String getEndOfDay(String date) {
		// 每月的最后一天
		LocalDate monthOfLastDate = LocalDate.parse(date).with(TemporalAdjusters.lastDayOfMonth());
		return monthOfLastDate.toString() + " " + LocalDateTime.MAX.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
	}

	/**
	 * 根据传入的参数获取该日器的月末日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-30
	 * 23:59:59”，注意月大月小以及闰年。
	 * 
	 * @return
	 */
	public static String getDateByMonthLast(String date) {
		// 每月的最后一天
		LocalDate monthOfLastDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"))
				.with(TemporalAdjusters.lastDayOfMonth());
		return monthOfLastDate.toString() + " " + LocalDateTime.MAX.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
	}

	/**
	 * 根据传入的日期获取年龄yyyy-MM-dd
	 * 
	 * @param date
	 * @return
	 */
	public static long getYears(String date) {// 1990-12-11
		// 获取当前系统时间
		LocalDate today = LocalDate.now();// 2019-12-11
		LocalDate playerDate = LocalDate.parse(date);// yyyy-MM-dd
		long years = ChronoUnit.YEARS.between(playerDate, today);
		return years;
	}

	/**
	 * 求过去日期离今天过去的天数(求未来日期离今天还剩的天数)
	 */
	public static long getDaysByDeparted(String departed) {
		// 获取当前系统时间
		LocalDate today = LocalDate.now();
		//
		LocalDate birthDate = LocalDate.parse(departed);
		System.out.println("相差的天数：" + ChronoUnit.DAYS.between(birthDate, today));
		System.out.println("相差的天数：" + Math.abs(ChronoUnit.DAYS.between(birthDate, today)));
		long days = Math.abs(ChronoUnit.DAYS.between(birthDate, today));
		return days;
	}
}
