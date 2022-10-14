package kr.co.exam;

import java.util.Arrays;
import java.util.Random;

public class Exam06 {

	public static void main(String[] args) {
		/*
		 *	1.	크기가 0인 정수 배열을 생성 후 Random을 사용하여
		 *		배열의 값들을 초기화한다.
		 *		Random은 0 ~ 100 사이의 난수값이 생성되도록 한다.
		 *		배열에는 홀수에 해당하는 값만 5개 저장되도록 한다.
		 */
		Random random = new Random();

		int odd[] = new int[0];
		int tmp[];

		while(odd.length < 5) {
			int num = random.nextInt(101);
			if (num % 2 == 1) {
				tmp = new int[odd.length + 1];
//				for(int j = 0; j < odd.length; j++) {
//					tmp[j] = odd[j];
//				}					
//							or
//				System.arraycopy(odd, 0, tmp, 0, odd.length);
//							or
				tmp = Arrays.copyOf(odd, odd.length + 1);
				
				tmp[tmp.length - 1] = num;
				odd = tmp;		
//							or
//				odd[odd.length - 1] = num;
			}
		}
		for(int i = 0; i < odd.length; i++) {
			System.out.printf("%d\t", odd[i]);
		}
	}

}
