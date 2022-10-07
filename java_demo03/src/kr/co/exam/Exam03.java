package kr.co.exam;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		/*
		 * 	사용자 입력을 활용하여 다음의 데이터를 입력받고 출력하시오.
		 * 
		 * 	카카오의 더치페이와 같이 총 금액과 인원 수를 입력 받고
		 * 	인원 수 당 얼마의 금액을 입금하면 되는지 계산하여 출력
		 * 
		 * 	출력 형식은 다음과 같습니다.
		 * 		총 금액 50000 원을 5 명이 나누어 인당 10000 원을
		 * 		다음의 계좌에 입금해 주세요. 나머지 금액 0 원은 제가 
		 * 		부담할게요.
		 * 		입금 계좌 : 0000-00-000-000000
		 * 
		 * 	입금 계좌 정보도 추가로 입력 받아야 합니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("총 금액이 얼마입니까?");
		int total = sc.nextInt();
		
		System.out.println("총 인원이 몇명입니까?");
		int people = sc.nextInt();	sc.nextLine();
		
		System.out.println("계좌번호를 입력하세요.");
		String bankNum = sc.nextLine();
		
		System.out.printf("총 금액 %,d 원을 %d 명이 나누어 인당 %,d 원을 "
				+ "다음의 계좌에 입금해 주세요. 나머지 금액 %,d 원은 제가 부담할게요.\n"
				+ "입금 계좌 : %s", total, people, (total/people), (total%people), bankNum);
	}

}
