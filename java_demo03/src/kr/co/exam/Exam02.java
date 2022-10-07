package kr.co.exam;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * 	사용자 입력을 활용하여 다음의 데이터를 입력받고 출력하시오.
		 * 
		 * 	시, 분, 초 정보를 입력 받아 각각 hour, minute, second 변수에
		 * 	저장을 하고 초 단위로 환산 후 출력하시오.
		 * 
		 * 	예시
		 * 		시 : 0
		 * 		분 : 10
		 * 		초 : 20
		 * 
		 * 		총 620 초 입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시 : ");
		int hour = sc.nextInt();
		
		System.out.print("분 : ");
		int minute = sc.nextInt();
		
		System.out.print("초 : ");
		int second = sc.nextInt();
		System.out.println();

		int total = hour*60*60 + minute*60 + second;
		System.out.printf("총 %d 초 입니다.", total);
	}

}
