package kr.co.exam01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class BirthDay {
	
	public static final String FOUR_YEAR_FORMAT = "yyyyMMdd";
	public static final String TWO_YEAR_FORMAT = "yyMMdd";
	
	private Date date;
	private int year;
	private int month;
	private int day;
	private SimpleDateFormat dateFormat;

	/**
	 * 6자리(yymmdd) 또는 8자리(yyyymmdd) 날짜 형식을 받아서
	 * BirthDay 객체를 생성하기 위한 생성자
	 * @param dateFormat : 날짜 형식을 가지는 문자열
	 */
	public BirthDay(String dateFormat) {
		switch (dateFormat.length()) {
		case 6:
			this.setDateFormat(BirthDay.TWO_YEAR_FORMAT);
			break;
		case 8:
			this.setDateFormat(BirthDay.FOUR_YEAR_FORMAT);
			break;
		}
		try {
			this.date = this.dateFormat.parse(dateFormat);
		} catch (ParseException e) {
			this.date = new Date();
			e.printStackTrace();
		}
	}
	
	/**
	 * 정수값에 해당하는 연도, 월, 일을 입력받아
	 * BirthDay 객체를 생성하기 위한 생성자
	 * @param year : 태어난 연도
	 * @param month : 태어난 달
	 * @param date : 태어난 일자
	 */
	public BirthDay(int year, int month, int date) {
		this.date = (new GregorianCalendar(year, month-1, date)).getTime();
	}
	
	/**
	 * java.util.Date 클래스를 입력받아 BirthDay 객체를 생성하기 위한 생성자
	 * @param date : java.util.Date 클래스
	 */
	public BirthDay(Date date) {
		this.date = date;
	}
	
	/**
	 * 밀리초에 해당하는 정수값을 받아 BirthDay 객체를 생성하기 위한 생성자
	 * 1970년 01월 01일 00시 00분 00초 000밀리초를 기준으로 함.
	 * @param milliSecond : Long 타입의 밀리초 값
	 */
	public BirthDay(long milliSecond) {
		this.date = new Date(milliSecond);
	}
	
	/**
	 * 지정한 날짜 형식으로 변환할 수 있도록 
	 * SimpleDateFormat 객체를 생성하여 활용하기 위해 사용
	 * @param format : BirthDay 클래스 상수에 정의된 포맷 문자열만 사용해야 함.
	 */
	private void setDateFormat(String format) {
		this.dateFormat = new SimpleDateFormat(format);
	}
	
	/**
	 * 현재 날짜를 기준으로 다음 생일을 반환
	 * 이미 생일이 지난 경우 다음년도에 대한 BirthDay 객체를 반환하고
	 * 아직 생일이 지나지 않은 경우 올해에 대한 BirthDay 객체를 반환한다.
	 * @return BirtDay : 다음 생일에 대한 정보를 담아 반환한다.
	 */
	public BirthDay nextBirthDay() {
		GregorianCalendar n = new GregorianCalendar();
		
		this.year = n.get(Calendar.YEAR);
		this.month = Integer.parseInt(String.format("%tm", this.date));
		this.day = Integer.parseInt(String.format("%td", this.date));
		
		GregorianCalendar b = new GregorianCalendar(year, month - 1, day);
		
		if (n.before(b)) {
			System.out.println("b보다 n이 더 이전 날짜입니다.");
			return new BirthDay(year, month, day);
		} else {
			System.out.println("b보다 n이 더 이후 날짜입니다.");
			return new BirthDay(year + 1, month, day);
		}
	}
	
	/**
	 * 현재 날짜 정보를 java.util.Date 객체로 반환한다.
	 * @return Date : 현재 시스템 날짜
	 */
	public Date currentDate() {
		return date;
		
	}

	/**
	 * 현재 날짜 정보를 문자열로 반환한다. 기본 포맷은 yyyy년 mm월 dd일이다.
	 * @return String : 날짜 형식의 문자열
	 */
	public String currentDateToString() {
		return String.format("%1$tY년 %1$tm월 %1$td일", new Date());
	}
	
	@Override
	public String toString() {
		return String.format("%1$tY년 %1$tm월 %1$td일", this.date);
	}
}
