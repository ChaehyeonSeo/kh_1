package kr.co.exam;

import java.util.Arrays;
import java.util.Random;

public class Exam10_2 {

	public static void main(String[] args) {
		/*
		 * 	1.	10 ~ 99 사이의 랜덤값을 10개 생성하여 정수 배열에 추가한다.
		 */
		System.out.println("1번");
		
		Random rd = new Random();
		
		int num1[] = new int[0];
		for(; num1.length < 10; ) {
			num1 = Arrays.copyOf(num1, num1.length + 1);
			num1[num1.length - 1] = rd.nextInt(90)+10;
		}
		System.out.println(Arrays.toString(num1));
		
		/*
		 * 	2.	1번에서 생성한 정수값을 짝수와 홀수로 나누어 2차 배열에 추가한다.
		 */
		System.out.println("2번");
		
		int num2[][] = new int[2][0];
		for(int i = 0; i < num1.length; i++) {
			int idx = num1[i] % 2;
			num2[idx] = Arrays.copyOf(num2[idx], num2[idx].length + 1);
			num2[idx][num2[idx].length - 1] = num1[i];
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
			int idx = x % 2;
			if(num2[idx].length < 10) {
				num2[idx] = Arrays.copyOf(num2[idx], num2[idx].length + 1);
				num2[idx][num2[idx].length - 1] = x;
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
		
		int num3[][] = Arrays.copyOf(num2, num2.length + 1);
		num3[2] = new int[0];
		for(int i = 0; i < num3[0].length; i++) {
			num3[2] = Arrays.copyOf(num3[2], num3[2].length + 1);
			num3[2][i] = num3[0][i] + num3[1][i];
		}
		for(int i = 0; i < num3.length; i++) {
			System.out.println(Arrays.toString(num3[i]));
		}
	}

}
