package kr.co.exam07_2;

import java.util.Arrays;

public class Exam {

	public static void main(String[] args) {
		/*	
		 * 	학생들의 성적을 관리하기 위한 용도의 클래스 생성
		 * 		학생 클래스
		 * 			멤버변수 : 성적배열, 이름, 학년
		 * 			멤버메서드 : 성적표 출력, 과목 점수 출력, 과목 점수 수정, 성적 추가/삭제
		 * 
		 * 		성적 클래스
		 * 			멤버변수 : 과목명, 점수, 등급
		 * 			멤버메서드 : 점수로 등급을 산출하는 메서드
		 */
		
		Student s = new Student("서채현");
		
		String table = s.getGradeTable();
		System.out.print(table);
		
		double score = s.getScore("과학");
		System.out.println(score);
		
		s.addSubject("과학", 76.5);
		s.addSubject("국어", 76.5);
		s.addSubject("수학", 76.5);
		s.addSubject(new Subject("영어", 67));
		table = s.getGradeTable();
		System.out.print(table);
		
		s.updateSubject("과학", 95);
		table = s.getGradeTable();
		System.out.print(table);
		
		System.out.println("-----------");
		
		s.removeSubject("수학");
		table = s.getGradeTable();
		System.out.println(table);
		
		Subject s1 = s.getSubject("영어");
		System.out.println(s1.getName() + "\t");
		System.out.println(s1.getScore() + "\t");
		System.out.println(s1.getGrade() + "\n");
		
		Subject sArr[] = s.getSubjects("영어", "국어", "수학", "과학");
		System.out.println(Arrays.toString(sArr));
	}

}
