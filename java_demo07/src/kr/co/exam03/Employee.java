package kr.co.exam03;

import java.util.Objects;

public class Employee {
	private String name;
	private int age;
	protected String role;
	
	public Employee() {}
	public Employee(String name, int age) {
		this();
		setName(name);
		setAge(age);
	}
	
	public void workOn() {
		System.out.println(role + getName() + "님이 출근했습니다.");
	}
	public void workOff() {
		System.out.println(role + getName() + "님이 퇴근했습니다.");
	}
	public void lunch() {
		System.out.println(role + getName() + "님이 점심식사를 하였습니다.");
	}
	public void overtime() {
		System.out.println(role + getName() + "님이 야근을 하였습니다.");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", role=" + role + "]";
	}
}
