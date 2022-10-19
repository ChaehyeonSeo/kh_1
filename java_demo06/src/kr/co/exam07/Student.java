package kr.co.exam07;

import java.util.Arrays;

public class Student {
	private String name;
	private Score score[] = new Score[0];
	private int grade;
	
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
//	성적추가
	public void add(String subject, double result) {
		this.score = Arrays.copyOf(this.score, this.score.length + 1);
		this.score[this.score.length - 1] = new Score(subject, result);
	}
	
//	성적표출력
	public String report() {
		String res = "";
		for(int i = 0; i < this.score.length; i++) {
			res += String.format("%s\t%.1f점\t%c등급\n", 
					this.score[i].subject, this.score[i].result, this.score[i].level);
		}
		return res;
	}
	
//	과목인덱스찾기
	private int findIndex(String subject) {
		int idx = -1;
		for(int i = 0; i < this.score.length; i++) {
			if(subject.equals(this.score[i].subject)) {
				idx = i;
				break;
			}
		}
		return idx;
	}
	
//	과목점수출력
	public double subResult(String subject) {
		return this.score[this.findIndex(subject)].result;
	}
	
//	과목점수수정
	public boolean change(String subject, double reResult) {
		int idx = this.findIndex(subject);
		if (idx != -1) {
			this.score[idx].result = reResult;
			return true;
		}
		return false;
	}
	
//	성적삭제
	public boolean delResult(String subject) {
		int idx = this.findIndex(subject);
		if(idx != -1) {
			for(int i = idx; i < this.score.length - 1; i++) {
				this.score[i] = this.score[i + 1];
				this.score = Arrays.copyOf(this.score, this.score.length - 1);
			}
			return true;
		}
		return false;
	}
}
