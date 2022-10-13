package kr.co.exam;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
//		Exam03.java 파일을 생성 후 다음의 문제를 풀어보세요.
//		사용자 입력으로 2~5 사이의 정수 값을 입력받아
//		입력받은 정수값과 동일한 크기의 배열을 생성하고, 
//		배열의 값을 초기화하기 위해 다시 사용자 입력을 사용하여 
//		1~10 사이의 값만을 입력받아 초기화하세요.
//		위와 동일한 과정으로 배열을 생성할 때 중복된 값이 없도록 초기화하세요.

		Scanner sc = new Scanner(System.in);
		System.out.println("2 ~ 5 사이의 정수를 입력하세요.");
		int i = sc.nextInt();
		int length = 0;
		if (i >= 2 && i <= 5) {
			length = i;
			int arr1[] = new int[length];

			System.out.println("1 ~ 10 사이의 정수를 입력하세요.");
			int input = 0;
			for(int j = 0; j < arr1.length; j++) {
				input = sc.nextInt();
				for(int x = 0; x < arr1.length; x++) {
					if (input == arr1[x]) {
						System.out.println("중복된 정수입니다.");
						break;
					} else if (input >= 1 && input <= 10) {
						arr1[j] = input;
					} else {
						System.out.println("다시 입력하세요.");
						break;
					}
				}
			}
			for(int k = 0; k < arr1.length; k++) {
				System.out.print(arr1[k] + "\t");
			}
		} else {
			System.out.println("다시 입력하세요.");
		}
	}

}
