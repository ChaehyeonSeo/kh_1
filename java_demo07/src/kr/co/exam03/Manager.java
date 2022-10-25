package kr.co.exam03;

public class Manager extends AssistantManager {
	
	public Manager() {
		this.role = "과장";
	}
	public Manager(String name, int age) {
		this();
		setName(name);
		setAge(age);
	}

	public void meetClient() {
		System.out.println(role + getName() + "님이 업체와 미팅합니다.");
	}
	public void businessTrip() {
		System.out.println(role + getName() + "님이 외부에 출장갑니다.");
	}                      
	public void callClient() {
		System.out.println(role + getName() + "님이 업체와 통화합니다.");
	}
	public Employee degreement() {
		return new AssistantManager(getName(), getAge());
	}
}
