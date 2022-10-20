package kr.co.exam07;

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
		
		Student s1 = new Student("서채현", 1);
		
		s1.add("국어", 92);
		s1.add("영어", 84);
		s1.add("수학", 96);
		
		System.out.println(s1.report());
		
		System.out.println(s1.subResult("영어"));
		
		System.out.println(s1.change("영어", 65));
		System.out.println(s1.subResult("영어"));

		s1.add("중국어", 70);
		System.out.println(s1.report());
		
		System.out.println(s1.delResult("영어"));
		System.out.println(s1.report());
	}

}
