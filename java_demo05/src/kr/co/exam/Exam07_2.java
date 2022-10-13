package kr.co.exam;

import java.util.Scanner;

public class Exam07_2 {

	public static void main(String[] args) {
		/*
		 * 	사용자 입력을 받아서 다음의 기능을 수행하는 코드 작성
		 * 		1. 입력한 횟수만큼 정수값을 입력 받아서 배열에 저장한다.
		 * 		2. 배열에 저장된 모든 정수의 합과 평균을 구하여 출력
		 * 		3. -1 입력이 들어오면 더 이상 사용자 입력을 받지 않는 것으로 한다.
		 * 
		 * 	예제
		 * 		1 번째 정수값 입력 : 7
		 * 		2 번째 정수값 입력 : 12
		 * 		3 번째 정수값 입력 : 24
		 * 		4 번째 정수값 입력 : -1
		 * 
		 * 		총 합 : 43
		 * 		평 균 : 14.3
		 */
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[0];
		
		int input = 0, count = 0, sum = 0;
		float avg = 0;
		
		while(true) {
			System.out.printf("%d 번째 정수값 입력 : ", ++count);
			input = sc.nextInt();
			
			if (input == -1) {
				break;
			}
			
			int tmp[] = new int[arr.length + 1];
			
			for(int j = 0; j < arr.length; j++) {
				tmp[j] = arr[j];
			}
			
			tmp[tmp.length - 1] = input;
			arr = tmp;
			sum += input;
		} 
		avg = (float) sum / arr.length;
		System.out.println("총 합 : " + sum);
		System.out.printf("평 균 : %.2f", avg);
		
	}

}
