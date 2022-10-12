package kr.co.exam;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
//		Exam02.java 파일을 생성 후 다음의 문제를 풀어보세요.
//		사용자 입력으로 5~10 사이의 정수 값을 입력받아
//		입력받은 정수값과 동일한 크기의 배열을 생성하세요.
//		그리고 배열의 값은 -1로 초기화하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("5 ~ 10 사이의 정수를 입력하세요.");
		int i = sc.nextInt();
		int length = 0;
		if (i >= 5 && i <= 10) {
			length = i;
		}
		int arr1[] = new int[length];
		
		for(int j = 0; j < arr1.length; j++) {
			arr1[j] = -1;
		}
		for(int k = 0; k < arr1.length; k++) {
			System.out.print(arr1[k] + "\t");
		}
	}

}
