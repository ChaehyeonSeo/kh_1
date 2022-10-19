package kr.co.exam07;

public class Score {
	public String subject;
	public double result;
	public char level;
	
	public Score(String subject, double result) {
		this.subject = subject;
		this.result = result;
		this.setLevel();
	}
	
	public void setResult(double result) {
		this.result = result;
		this.setLevel();
	}
	
	public double getResult() {
		return this.result;
	}
	
//	점수로 등급을 산출하는 메서드
	public void setLevel() {
		switch ((int)(this.result / 10)) {
		case 10:
		case 9:
			this.level = 'A'; break;
		case 8:
			this.level = 'B'; break;
		case 7:
			this.level = 'C'; break;
		case 6:
			this.level = 'D'; break;
		default:
			this.level = 'F'; break;
		}
	}
	
	public char getLevel() {
		return this.level;
	}
}