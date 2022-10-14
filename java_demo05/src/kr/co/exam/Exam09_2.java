package kr.co.exam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exam09_2 {

	public static void main(String[] args) {
		/*
		 * 	1. 다음의 문자열 배열을 생성한다.
		 * 		String Subjects[] = {"국어", "영어", "수학"};
		 * 	2. 사용자로부터 1 ~ 5 사이의 정수를 입력받는다.
		 * 	3. 1번에서 생성한 배열의 길이와 2번에서 입력한 정수의 값을 사용하여 2차배열 생성
		 * 	4. 2차배열에 저장할 값을 사용자 입력을 통해 받는다.
		 *		국어 점수 입력 : 60
		 * 		영어 점수 입력 : 70
		 * 		수학 점수 입력 : 80
		 * 	5. 2차배열에 저장된 값을 출력하여 확인
		 * 		국어		영어		수학		평균		총점
		 * 		60		70		80		70.00	210
		 * 		60		75		82		72.33	217
		 * 	동적 배열 활용하여 총점이 배열에 추가될 수 있게 하세요.
		 */
		Scanner sc = new Scanner(System.in);
		String Subjects[] = {"국어", "영어", "수학"};
		int count = 0;
		while (!(count >= 1 && count <= 5)) {
			System.out.println("1 ~ 5 사이의 정수를 입력하세요.");
			count = sc.nextInt();
		}
		int score[][] = new int[count][Subjects.length];
		double avg[] = new double[count];
		int sum[] = new int[count];
		int tmp[];
		for(int i = 0; i < count; i++) {
			System.out.println(i + 1 + "번 학생");
			for(int j = 0; j < Subjects.length; j++) {
				System.out.printf("%s 점수 입력 : ", Subjects[j]);
				score[i][j] = sc.nextInt(); 
				sum[i] += score[i][j];
			}

			score[i] = Arrays.copyOf(score[i], score[i].length + 1);
			score[i][score[i].length - 1] = sum[i];
			avg[i] = sum[i]/Subjects.length;
		}
		
		for(int i = 0; i < Subjects.length; i++) {
			System.out.printf("%s\t\t", Subjects[i]);
		}
		System.out.println("총점\t\t평균");
		
		for(int i = 0; i < count; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf("%d\t\t", score[i][j]);
			}
			System.out.println(avg[i]);
		}
	}
}
