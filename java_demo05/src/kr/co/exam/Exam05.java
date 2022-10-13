package kr.co.exam;

import java.util.Random;

public class Exam05 {

	public static void main(String[] args) {
		/*
		 * 1.	크기가 10인 정수 배열을 생성 후 Random을 사용하여
		 * 		배열의 값들을 초기화한다.
		 * 		Random은 0~100 사이의 난수값이 생성되도록 한다.
		 */
		System.out.println("1번");
		Random random = new Random();
		int arr1[] = new int[10];
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = random.nextInt(101);
			System.out.printf("%d\t", arr1[i]);
		}
		System.out.println();
		
		/* 
		 * 2.	1번에서 생성한 배열을 그대로 사용하여 배열 안에 있는
		 * 		정수값 중 짝수에 해당하는 값만 분류하여 출력.
		 * 		(짝수값의 수량도 마지막에 출력)
		 */
		System.out.println("2번");
		int count = 0;
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] % 2 == 0) {
				System.out.printf("%d\t", arr1[i]);
				count++;
			}
		}
		System.out.println("\n짝수값의 수량은 " + count);
		
		/* 
		 * 3.	2번에 의해 분류된 짝수들만을 모아두기 위한 새로운 정수
		 * 		배열을 만들고 저장
		 */
		System.out.println("3번");
		int arr2[] = new int[count];
		for(int i = 0, j = 0; i < arr1.length; i++) {
			if(arr1[i] % 2 == 0) {
				arr2[j] = arr1[i];
				j++;
			} 
		}
		for(int k = 0; k < arr2.length; k++) {
			System.out.printf("%d\t", arr2[k]);
		}
	}
}
