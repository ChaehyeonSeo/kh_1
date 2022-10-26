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
		
//		append() : 문자열 추가
		StringBuilder sb = new StringBuilder();
		sb.append("문자열");
		sb.append("추가");
		System.out.println(sb.toString());
		
//		capacity() : 버퍼크기
		int capacity = sb.capacity();
		System.out.println(capacity);
		
//		delete() : 문자열 삭제
		sb = sb.delete(0, 3);
		System.out.println(sb.toString());
		
//		insert() : 지정한 위치에 문자열 추가
		sb = sb.insert(0, "문자열");
		System.out.println(sb.toString());
		sb = sb.insert(3, " insert() ");
		System.out.println(sb.toString());
		
//		length() : 문자열 길이
		int length = sb.length();
		System.out.println(length);
		
//		reverse() : 문자열을 역순으로 나열
		sb.reverse();
		System.out.println(sb.toString());
		
//		setLength() : 문자열 길이 변경
		sb.setLength(20);
		sb.reverse();
		System.out.println(sb.toString());

//		trimToSize() : 버퍼크기를 문자열 길이로 변경
		sb.trimToSize();
		System.out.println(sb.capacity());
		
//		sb.indexOf(), sb.replace(), sb.charAt(), sb.compareTo(), sb.substring()
//		위 메서드는 기존 String 클래스에서 사용한 메서드와 동일한 기능 수행
	}
	
}
