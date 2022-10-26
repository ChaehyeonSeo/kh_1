package kr.co.exam01;

import java.util.Arrays;
import java.util.Scanner;

public class Exam {
	
	public static void main(String[] args) {
		/*
		 * Scanner 츨래스를 사용하여 사용자 입력을 받고 다음의 작업을 수행해보세요.
		 * 
		 * 1. nextLine() 메서드를 사용하여 정수에 해당하는 문자열을 입력받으세요.
		 *    입력 형식은 "10 20 30 40 ..." 형식으로 정수에 해당하는 값 중간에
		 *    공백으로 띄어진 형태 입니다.
		 *    이와 같이 입력 받은 정수 형태의 문자열을 공백을 기준으로 분류하여 문자열
		 *    배열에 저장하세요.
		 *    만약 공백이 아닌 , 와 같은 문자를 구분자로 사용한 경우 다시 입력하도록 하세요.
		 */
		Scanner sc = new Scanner(System.in);
		
		String inputArr[] = new String[0];
		while (inputArr.length == 0) {
			System.out.println("공백을 구분자로 하여 정수값 여러개를 입력하세요.");
			String input = sc.nextLine();
			if (!(input.contains(" ")) || input.contains(",") || input.contains(".")) {
				continue;
			} else {
				inputArr = input.split(" ");
			}
		}
		System.out.println(Arrays.toString(inputArr));
	}
}
