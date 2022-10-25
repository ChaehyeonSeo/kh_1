package kr.co.exam03;

public class Staff extends Intern {
	
	public Staff() {
		this.role = "사원";
	}
	public Staff(String name, int age) {
		this();
		setName(name);
		setAge(age);
	}
	
	public void research() {
		System.out.println(role + getName() + "님이 자료를 조사합니다.");
	}
	public void document() {
		System.out.println(role + getName() + "님이 문서를 작성합니다.");
	}
	public void careIntern() {
		System.out.println(role + getName() + "님이 인턴을 봐줍니다.");
	}
	
	@Override
	public Employee elevate() {
		return new AssistantManager(getName(), getAge());
	}
	public Employee degreement() {
		return new Intern(getName(), getAge());
	}
}
