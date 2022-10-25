package kr.co.exam03;

public class AssistantManager extends Staff {
	
	public AssistantManager() {
		this.role = "대리";
	}
	public AssistantManager(String name, int age) {
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
	public void callClient() {
		System.out.println(role + getName() + "님이 업체와 통화합니다.");
	}
	public void checkDocument() {
		System.out.println(role + getName() + "님이 문서를 검토합니다.");
	}
}
