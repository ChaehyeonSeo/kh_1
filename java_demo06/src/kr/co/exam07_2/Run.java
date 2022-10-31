package kr.co.exam07_2;

import java.util.Scanner;

public class Run {
	
		private Scanner sc = new Scanner(System.in);
		private Student s;
		
		private String intro() {
			String menu = "";
			menu += "1. 성적표 출력\n";
			menu += "2. 과목 성적 출력\n";
			menu += "3. 과목 성적 추가\n";
			menu += "4. 과목 성적 수정\n";
			menu += "5. 과목 성적 삭제\n";
			menu += "6. 프로그램 종료\n";
			
			return menu;
		}
		
		private void select(int number) {
			
		}
		
		switch (menu) {
		case 1:
			double sum = 0;
			for(int i = 0; i < s.subjects.length; i++) {
				Subject subject = s.subjects[i];
				System.out.printf("\t%s", subject.getName());
			}
			System.out.print("\t평균\n점수");
			for(int i = 0; i < s.subjects.length; i++) {
				Subject subject = s.subjects[i];
				System.out.printf("\t%s", subject.getScore());
				sum += subject.getScore();
			}
			System.out.print("\t" + sum/s.subjects.length + "\n등급");
			for(int i = 0; i < s.subjects.length; i++) {
				Subject subject = s.subjects[i];
				System.out.printf("\t%s\n", subject.getGrade());
			}
			
			System.out.println("초기 메뉴로 돌아가려면 Enter 입력!");
			
		case 2:
			System.out.print("출력할 과목명 : ");
			String subject2 = sc.nextLine();
			System.out.println(s.getScore(subject2));
			
		case 3:
			System.out.print("추가할 과목명 : ");
			String subject3 = sc.nextLine();
			s.addSubject(subject3);
			System.out.print("성적 입력(0~100) : ");
			int score3 = sc.nextInt();
			s.updateSubject(subject3, score3);
			
		case 4:
			System.out.print("수정할 과목명 : ");
			String subject4 = sc.nextLine();
			System.out.print("성적 입력(0~100) : ");
			int score4 = sc.nextInt();
			s.updateSubject(subject4, score4);
			
		case 5:
			System.out.print("삭제할 과목명 : ");
			String subject5 = sc.nextLine();
			s.removeSubject(subject5);
			
		case 6:
			
		default:
			break;
	}
	
}
