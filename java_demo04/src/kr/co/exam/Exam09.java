package kr.co.exam;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
//		사용자 입력으로 월, 시작 요일, 마지막 일자 정보를 
//		입력 받아 다음 예시와 같이 출력하세요.
//		
//		월 : 10
//		시작요일 : 토
//		마지막일자 : 31
//		
//		10 월
//		일	월	화	수	목	금	토
//								1
//		2	3	4	5	6	7	8
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 : ");
		int month = sc.nextInt(); sc.nextLine();
		System.out.print("시작요일 : ");
		String firstDay = sc.nextLine();
		System.out.print("마지막일자 : ");
		int lastDay = sc.nextInt();
		System.out.println();
		
		System.out.printf("%d 월\n", month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int weekDay = 0;
		switch (firstDay) {
		case "일":
			weekDay = 0; break;
		case "월":
			weekDay = 1; break;
		case "화":
			weekDay = 2; break;
		case "수":
			weekDay = 3; break;
		case "목":
			weekDay = 4; break;
		case "금":
			weekDay = 5; break;
		case "토":
			weekDay = 6; break;
		}			
		for(int i = 1; i <= weekDay; i++) {
			System.out.print("\t");
		}
		for(int day = 1; day <= lastDay; day++) {
			System.out.printf("%d\t", day);
			if(weekDay == 0) {
				if(day % 7 == 0) {
					System.out.println();
				}
			} if(day % 7 == 7-weekDay) {
				System.out.println();
			} 
		}
	}

}
