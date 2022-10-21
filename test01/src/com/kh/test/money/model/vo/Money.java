package com.kh.test.money.model.vo;

public class Money {
	public static String UNIT = "원";
	private int money;
	
	public Money(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return this.money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void setUnit(String UNIT) {
		this.UNIT = UNIT;
	}
	public static String getUnit() {
		return UNIT;
	}
		
	public void print() {
		System.out.println(this.money + UNIT + "이 있습니다.");
	}
}