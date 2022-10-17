package kr.co.exam;

import java.util.Arrays;
import java.util.Random;

public class Exam10 {

	public static void main(String[] args) {
		/*
		 * 	1.	10 ~ 99 사이의 랜덤값을 10개 생성하여 정수 배열에 추가한다.
		 */
		System.out.println("1번");
		
		Random rd = new Random();
		
		int num1[] = new int[10];
		for(int i = 0; i < num1.length; i++) {
			num1[i] = rd.nextInt(90)+10;
		}
		System.out.println(Arrays.toString(num1));
		
		/*
		 * 	2.	1번에서 생성한 정수값을 짝수와 홀수로 나누어 2차 배열에 추가한다.
		 */
		System.out.println("2번");
		
		int num2[][] = new int[2][0];
		for(int i = 0; i < num1.length; i++) {
			for(int j = 0; j < 2; j++) {
				if(num1[i] % 2 == j) {
					num2[j] = Arrays.copyOf(num2[j], num2[j].length + 1);
					num2[j][num2[j].length - 1] = num1[i];
				}
			}
		}
		for(int i = 0; i < 2; i++) {
			System.out.println(Arrays.toString(num2[i]));
		}
		
		/*
		 * 	3.	2번에서 생성된 2차 배열에 추가로 10 ~99 사이의 랜덤을 생성하여
		 *		저장할 때 짝수는 짝수 배열에 홀수는 홀수 배열에 저장.
		 *		(여기에서 추가하는 정수는 2차 배열의 중첩된 배열의 크기가 10개가
		 *		될 때까지 수행한다.)
		 */
		System.out.println("3번");

		while(num2[0].length < 10 || num2[1].length < 10) {
			int x = rd.nextInt(90) + 10;
			if(x % 2 == 0) {
				if(num2[0].length < 10) {
					num2[0] = Arrays.copyOf(num2[0], num2[0].length + 1);
					num2[0][num2[0].length - 1] = x;
				}
			} else {
				if(num2[1].length < 10) {
					num2[1] = Arrays.copyOf(num2[1], num2[1].length + 1);
					num2[1][num2[1].length - 1] = x;
				}
			}
		}
		for(int i = 0; i < 2; i++) {
			System.out.println(Arrays.toString(num2[i]));
		}

		/*
		 * 	4.	3번에서 완성된 2차 배열의 동일한 열(인덱스)의 값의 합을 구하여
		 * 		3번째(2번 인덱스)에 추가할 배열로 만들어 추가한다.
		 */
		System.out.println("4번");
		
		int colSum[] = new int [num2.length];
		for(int i = 0; i < num2.length; i++) {
			colSum[i] = num2[0][i] + num2[1][i];
		}
	}

}
