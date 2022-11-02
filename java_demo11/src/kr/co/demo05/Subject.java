package kr.co.demo05;

public class Subject {
	public String subject;
	public double score;
	public char grade;
	
	public Subject(String subject, double score) {
		this.subject = subject;
		this.score = score;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String name) {
		this.subject = name;
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
		switch ((int)this.score / 10) {
		case 10:
		case 9: this.grade = 'A'; break;
		case 8: this.grade = 'B'; break;
		case 7: this.grade = 'C'; break;
		case 6: this.grade = 'D'; break;
		case 5: this.grade = 'E'; break;
		default: this.grade = 'F'; break;
		}
	}
	
	
}
