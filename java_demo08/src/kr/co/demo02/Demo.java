package kr.co.demo02;

public class Demo {
	
	public static void main(String[] args) {
		/*
		 * 	StringBuilder / StringBuffer
		 *	  - StringBuilder : 문자열 클래스로 String의 불변타입을 변경가능으로
		 * 						사용할 수 있게 만들어진 클래스이다.
		 * 						Thread safe 기능을 제공하지 않는다.
		 * 
		 * 	  - StringBuffer : StringBuilder 동일한 기능의 클래스로 유일한 차이는
		 * 					   Thread safe 기능을 제공하는 것이다.
		 * 					   Thread safe 기능은 다중 쓰레드 작업에 활용될 때 
		 * 					   공유 자원에 대한 안정성을 높여주기 위한 기능
		 */
		
		StringBuilder sb = new StringBuilder();
		sb.append("문자열");
		sb.append("추가");
		System.out.println(sb);
		
		String str = "문자열";
		str += "추가";
		System.out.println(str);
	}
	
}
