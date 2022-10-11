package kr.co.exam;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * 	사용자 입력과 if 문을 활용하여 사용자로부터 정수값을 
		 * 	입력 받았을 때 5의 배수 값만 출력하게 하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력하세요.");
		int x = sc.nextInt();
		
		if (x % 5 == 0) {
			System.out.printf("사용자가 입력한 값 %d는 5의 배수입니다.%n", x);
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
