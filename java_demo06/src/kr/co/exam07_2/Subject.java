package kr.co.exam07_2;

public class Subject {
	public String name;
	public double score;
	public char grade;
	
	public Subject(String name) {
		this.name = name;
	}
	public Subject(String name, double score) {
		this.name = name;
		this.score = score;
		this.setGrade();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setScore(double score) {
		this.score = score;
		this.setGrade();
	}
	
	public double getScore() {
		return this.score;
	}
	
//	점수로 등급을 산출하는 메서드
	private void setGrade() {
		switch ((int)(this.score / 10)) {
		case 10:
		case 9:
			this.grade = 'A'; break;
		case 8:
			this.grade = 'B'; break;
		case 7:
			this.grade = 'C'; break;
		case 6:
			this.grade = 'D'; break;
		default:
			this.grade = 'F'; break;
		}
	}
	
	public char getGrade() {
		return this.grade;
	}
	
	public boolean isExists(String name) {
		return this.name.equals(name);
	}
	
}