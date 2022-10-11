package kr.co.exam;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		/*
		 * 	사용자 입력과 if 문을 활용하여 사용자로부터 정수값을 
		 * 	2개를 입력 받아 나누기 계산을 수행하고 그 결과를 
		 * 	출력하세요. 만약 사용자 입력값 중에 0이 있어서
		 * 	산술에러가 발생하는 경우 이를 처리하기 위한 if 문을
		 * 	추가로 작성하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수값을 입력하세요.");
		int x = sc.nextInt();
		System.out.println("두번째 정수값을 입력하세요.");
		int y = sc.nextInt();
		
		if (y != 0) {
			System.out.printf("x / y = %d%n", x / y);
		} else {
			System.out.println("연산을 수행할 수 없습니다.");
		}
	}

}
