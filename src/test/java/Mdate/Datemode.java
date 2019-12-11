package Mdate;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

import org.junit.jupiter.api.Test;

import com.bawei.util.DateUtils;

/**
 * @author ztc
 *
 * 2019年12月11日
 */
class Datemode {
	/**
	 * 
		
		方法3 :根据传入的参数获取该日器的月末日期，例如给定的日期为“2019-09-19 
		
		方法5：求过去日期离今天过去的天数
	 */
	/**
	 *  方法1：根据传入的日期获取年龄
	 */
	@Test
	void test(){
		Mdate.DateUtils dateUtils = new Mdate.DateUtils();
		long years = Mdate.DateUtils.getYears("2001-01-22");
		System.out.println(years);
	}
	
	/**
	 * 方法2：根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，
	 */
	@Test
	void test1(){
		String dateByMonthInit = Mdate.DateUtils.getDateByMonthInit("2019-09-19");
		System.out.println(dateByMonthInit);
	}
	
	/**
	 * 方法3 :根据传入的参数获取该日器的月末日期，例如给定的日期为“2019-09-19 
	 */
	@Test
	void test2(){
		String dateByMonthInit = Mdate.DateUtils.getDateByMonthLast("2019-09-19");
		System.out.println(dateByMonthInit);
	}
	
	/**
	 * 方法4：求未来日期离今天还剩的天数
	 */
	@Test
	void test3(){
		long daysByDeparted = Mdate.DateUtils.getDaysByDeparted("2025-09-19");
		System.out.println(daysByDeparted);
	}
}
