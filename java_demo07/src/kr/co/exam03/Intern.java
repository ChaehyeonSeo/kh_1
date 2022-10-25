package kr.co.exam03;

public class Intern extends Employee {
	
	public Intern() {
		this.role = "인턴";
	}
	
	public Intern(String name, int age) {
		this();
		setName(name);
		setAge(age);
	}

	public void filing() {
		System.out.println(role + getName() + "님이 서류를 정리합니다.");
	}                      
	public void fileCopy() { 
		System.out.println(role + getName() + "님이 자료를 복사합니다.");
	}
	
	public Employee elevate() {
		return new Staff(getName(), getAge());
	}
	public Employee degreement() {
		return new Employee(getName(), getAge());
	}
}
