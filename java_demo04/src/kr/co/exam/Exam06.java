package kr.co.exam;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		/*
		 * 	사용자 입력과 if, for 를 활용하여 사용자로부터 정수값을
		 * 	입력 받았을 때 1~45 사이의 값이 아니면 다시 입력을 받아서
		 * 	1~45 사이의 값이 저장될 수 있게 한다. 
		 * 	(단 3번의 기회만 부여하고 3번을 넘기면 0 값이 저장되게 한다.)
		 */
			
		Scanner sc = new Scanner(System.in);
		int input;
		int num = 0;
		for(int count = 1; count <= 3; count++) {
			System.out.println("1 ~ 45 사이의 정수값을 입력하세요.");
			input = sc.nextInt();
			if (input <= 45 && input >= 1) {
				num = input;
				break;
			} else {
				if(count != 3) {
					System.out.printf("다시 입력하세요. (%d/3)\n", count);
				} else {
					System.out.println("모든 입력 기회를 소진하였습니다.");
				}
			}
		}
		System.out.printf("%d를 변수에 저장하였습니다.", num);
	}
}