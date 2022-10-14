package kr.co.exam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		/*
		 * 	Random 클래스를 활용하여 다음의 문제를 풀어보세요.
		 * 		1. Scanner 클래스로 사용자로부터 1 ~ 5 사이의 정수 입력
		 * 		2. 1 ~ 45 까지의 난수 6개를 생성
		 * 		3. 2차 배열을 생성할 때 행의 크기 : 사용자 입력값, 열의 크기 : 6
		 * 		4. 2번에서 생성한 난수를 3번에서 생성한 2차 배열에 전부 저장
		 * 		5. 2차 배열에 저장된 값 출력해서 확인
		 */

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int rowSize = 0;
		while (!(rowSize >= 1 && rowSize <= 5)) {
			System.out.println("1 ~ 5 사이의 정수를 입력하세요.");
			rowSize = sc.nextInt();
		}
		
		int arr[][] = new int[rowSize][6];
		
		for(int i = 0; i < rowSize; i++) {
			for(int j = 0; j < 6; j++) {
				arr[i][j] = rd.nextInt(45) + 1;
			}
		}
		
		for(int i = 0; i < rowSize; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
