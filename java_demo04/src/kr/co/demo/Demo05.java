package kr.co.demo;

public class Demo05 {

	public static void main(String[] args) {
		/* 	
		 * 	while 반복문
		 * 	while(조건식) {
		 * 		실행 코드;
		 * 	}
		 * 
		 * 	조건식의 값이 참일 때 반복을 수행하며, 거짓이 되면 반복 중단
		 * 
		 * 	break, continue 사용으로 반복문을 제어할 수 있다.
		 */
		
		int i = 1;			// 초기식
		while(i <= 5) {		// 조건식
			System.out.printf("%d\n", i);
			i++;			// 증감식
		}
		
//		무한 반복
		while(true) {
			System.out.printf("%d\n", i);
			if(i >= 10) {
				break;
			}
			i++;
		}
		
//		일정 횟수 반복
		int j = 0;
		while(j < 10) {
			System.out.printf("총 10번 반복 중 %d번 반복함\n", j+1);
			j++;
		}
		
//		1~n 까지 범위에서 m의 배수에 해당하는 값 출력
		int n = 100;
		int m = 7;
		int k = 1;
		while(k <= n) {
			if (k % m == 0) {
				System.out.println(k);
			}
			k++;
		}
		
//		중첩 반복문
		i = 1;
		while(i <= 9) {
			j = 1;
			while(j <= 9) {
				System.out.printf("%d X %d = %d\t", j, i, j*i);
				j++;
			}
			System.out.println();
			i++;
		}
		
		/*
		 * 	do ~ while
		 * 		일단 1회 반복은 수행한다.
		 * 
		 * 	do {
		 * 		반복 실행 코드;
		 * 	} while(조건식);
		 */
		
	}

}
