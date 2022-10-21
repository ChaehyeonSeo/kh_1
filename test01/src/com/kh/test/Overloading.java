package com.kh.test;

public class Overloading {
//	public void test() {}
//	public void test(String str) {}
//	public void test(int i) {}
	public void test(String s) {}
	public void test(char ch) {}
	public void test(String str, int i) {}
	public void test(int i, String str) {}
	private void test(int i) {}
	public int test() {return 0;}
	
//	public void test() {}
//	public void test(String str) {}
//	public void test(int i) {}
//	public void test(String s) {}
//	private void test(int i) {}
//	public int test() {return 0;}
	
//	메소드 오버로딩 시 매개변수의 자료형과 개수는 다르게 구성되어야 하는데,
//	public void test() {} / public int test() {return 0;}
//	public void test(String str) {} / public void test(String str) {}
//	public void test(int i) {} / private void test(int i) {}
//	위의 코드 라인들은 매개변수의 자료형과 개수가 일치하기 때문에 에러가 발생했다.
}
