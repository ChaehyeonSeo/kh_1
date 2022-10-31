package kr.co.exam02;

public class Person {
	
	private int year;
	private int group;
	private String subject[];
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	
	public String[] getSubject() {
		return this.subject;
	}
	public void setSubject(String[] subject) {
		this.subject = subject;
	}
	
	public String[] addSubject() {
		return null;
	}
	public String[] setSubject() {
		return null;
	}
	public String[] delSubject() {
		return null;
	}
	public String[] findSubject() {
		return null;
	}
}
