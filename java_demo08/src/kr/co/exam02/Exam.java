package kr.co.exam02;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		/*
		 * 	사용자 입력을 사용하여 010-xxxx-xxxx 과 같은 형식의 전화번호를
		 * 	입력받으세요.
		 * 		1. 전화번호는 반드시 010으로 시작해야 합니다.
		 * 		2. - 으로 구분된 전화번호 형식이 입력되어야 합니다.
		 * 		3. 사용자가 입력하는 전화번호는 나중에 출력할 때 숨김 처리되어
		 * 		   출력되어야 합니다.
		 * 			입력 : 010-1234-5678
		 * 			출력 : 010-1234-****
		 */
		Scanner sc = new Scanner(System.in);
		String input, output;
		
		while (true) {
			System.out.println("전화번호를 아래와 같은 양식으로 입력하세요.");
			System.out.println("010-xxxx-xxxx");
			System.out.print("입력 : ");
			input = sc.nextLine();
			if(!(input.startsWith("010-"))) {
				continue;
			} else {
				output = input.substring(0, 9) + "****";
				break;
			}
		}
		System.out.println("출력 : " + output);
	}

}
