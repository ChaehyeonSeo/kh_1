package kr.co.exam02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("전화번호 입력");
			String input = sc.nextLine();
			
			Phone phone = Phone.valueOf(input);
			
			
		}
	}

}
