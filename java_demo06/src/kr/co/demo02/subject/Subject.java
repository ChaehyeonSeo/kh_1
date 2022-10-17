package kr.co.demo02.subject;

public class Subject {
	private String name;
	private double score;
	
	public Subject(String name, double score) {
		this.name = name;
		this.score = score;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
	
	public double getScore() {
		return this.score;
	}
	
//	접근제한자	반환타입	메서드명 ↙매개변수
	public String getGrade() {
		if (this.score >= 90 && this.score <= 100) {
			return "A";	
		} else if (this.score >= 80 && this.score < 90) {
			return "B";
		} else if (this.score >= 70 && this.score < 80) {
			return "C";
		} else if (this.score >= 60 && this.score < 70) {
			return "D";
		} else {
			return "F";
		}	// ↖반환 : 메서드 실행 종료
	}
}
