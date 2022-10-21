package com.kh.test;

import java.util.Scanner;

public class Test {
	public void sum() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;
		if(num > 0) {
			int i = 1;
			while (i <= num) {
				sum += i;
				i++;
			}
			System.out.println("1부터" + num + "까지의 합은 " + sum + "입니다.");
		} else {
			System.out.println("숫자가 1 이상이 아닙니다.");
		}

		/*
		 * 2.	13번째 줄의 if(num >= 0) 때문에 0 초과가 아닌 0 이상의 숫자를 입력할 수 있다.
		 * 		따라서 0을 입력했을 때에는 안내문구가 출력되지 않는다.
		 * 3.	while문 내에 i의 증감식이 존재하지 않아서 i=1인 상태로 반복되기 때문에 반복문이 종료되지 않는다.
		 */

		/*
		 * 2.	if(num >= 0) -> if(num > 0)
		 * 3.	while문 내에 i++; 추가
		 */
	}
}
