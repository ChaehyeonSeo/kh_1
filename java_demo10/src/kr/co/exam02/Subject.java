package kr.co.exam02;

public class Subject {
	
	private String name;
	private double score;
	private char grade;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Subject [name=" + name + ", score=" + score + ", grade=" + grade + "]";
	}
	
}
