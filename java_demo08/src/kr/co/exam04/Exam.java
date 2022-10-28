package kr.co.exam04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) throws ParseException {
		/*
		 * 	현재 날짜를 구하고 다음 형식에 맞추어 출력하세요.
		 * 		1. 2022/01/01
		 * 		2. 2022년 01월 01일
		 * 		3. 12시 15분 45초
		 * 		4. 12:15:45
		 */
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat df1 = new SimpleDateFormat("1. yyyy/MM/dd");
		String strDate = df1.format(date);
		System.out.println(strDate);
		
		df1.applyPattern("2. yyyy년 MM월 dd일");
		strDate = df1.format(date);
		System.out.println(strDate);
		
		df1.applyPattern("3. HH시 mm분 ss초");
		strDate = df1.format(date);
		System.out.println(strDate);
		
		df1.applyPattern("4. HH:mm:ss");
		strDate = df1.format(date);
		System.out.println(strDate);
		
		/* 
		 * 	2022년 10월 중 주말에 해당하는 날짜만 문자열 배열에 담아 출력하세요.
		 */
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		Date[] weekend = new Date[0];
		GregorianCalendar gc = new GregorianCalendar(2022, 9, 1);
		for(int i = 0; i < gc.getMaximum(Calendar.DAY_OF_MONTH); i++) {
			int gcDay = gc.get(Calendar.DAY_OF_WEEK);
			if (gcDay == 1 || gcDay == 7) {
				weekend = Arrays.copyOf(weekend, weekend.length + 1);
				weekend[weekend.length-1] = gc.getTime();
			}
			gc.add(Calendar.DATE, 1);
		}
		System.out.println(Arrays.toString(weekend));
		for (int i = 0; i < weekend.length; i++) {
			System.out.println(df.format(weekend[i]));
		}
		
		/* 
		 * 	자신의 생년월일을 입력하면 현재로부터 몇일 남았는지 알려주는 D-DAY 정보를 출력하세요.
		 * 	  - GregorianCalendar의 isLeapYear()를 사용하면 윤년을 알 수 있습니다.
		 * 	  - GregorianCalendar의 getMaximum(Calendar.DAY_OF_MONTH)을 
		 * 		사용하면 해당 월의 최대 일자를 알 수 있습니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		Calendar today = Calendar.getInstance();
		int birthYear = 0, birthMonth = 0, birthDate = 0;
		while (true) {
			System.out.println("생년월일을 입력하세요.");
			String input = sc.nextLine();
			if (input.length() == 8) {
				birthYear = Integer.parseInt(input.substring(0, 4));
				birthMonth = Integer.parseInt(input.substring(4, 6));
				birthDate = Integer.parseInt(input.substring(6, 8));
			} else if (input.length() == 6) {
				birthYear = Integer.parseInt(input.substring(0, 2));
				birthMonth = Integer.parseInt(input.substring(2, 4));
				birthDate = Integer.parseInt(input.substring(4, 6));	
			} else {
				System.out.println("잘못된 형식입니다.");
				continue;
			}
			for(int i = 0; i < 1500; i++) {
				if (birthDate == today.get(Calendar.DATE) && birthMonth == today.get(Calendar.MONTH) + 1) {
					System.out.println(i);
					break;
				} else {
					today.add(Calendar.DATE, 1);
				}
				if (i == 1499) {
					System.out.println("잘못된 형식입니다.");
					break;
				}
			}
			break;
			
		}
		
	}
	
}
