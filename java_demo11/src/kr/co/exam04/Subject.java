package kr.co.exam04;

public class Subject {
	public double score;
	public char grade;

	public Subject(double score, char grade) {
		this.score = score;
		this.grade = grade;
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

}
