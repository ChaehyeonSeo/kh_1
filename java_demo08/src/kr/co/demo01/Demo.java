package kr.co.demo01;

import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		/*
		 * 	String 관련 클래스
		 * 	  - String : 문자열 클래스로 문자열 데이터를 다루기 위해 사용한다.
		 * 				 수정 불가능한 타입(불변타입)으로 데이터 수정 시
		 * 				 원본 데이터를 복사하여 새로운 데이터를 만드는 형태로 동작
		 * 
		 */
		
//		문자열 생성 방법
		String str1 = "문자열 리터럴을 사용하여 생성";
		String str2 = new String("new 연산자로 문자열 생성");
		
		char ch[] = new char[] {'문', '자', '배', '열'};
		String str3 = new String(ch);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
//		특정 위치에 있는 '문자'를 반환하는 메서드
		for (int i = 0; i < str1.length(); i++) {
			char c1 = str1.charAt(i);
			System.out.printf("str1.charAt(%d) -> %c\n", i, c1);
		}
		
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.printf("이 문자열에는 공백이 %d개가 있습니다.\n", count);
		
//		문자 코드값을 반환하는 메서드
		int point = str1.codePointAt(0);
		System.out.printf("%d -> %c\n", point, (char)point);
		
		str1 = new String("가");
		str2 = new String("힇");
		int compare = str1.compareTo(str2);
		System.out.println(compare);
		
		compare = str2.compareTo(str1);
		System.out.println(compare);
		
		System.out.println(str1.codePointAt(0) + "-" + str2.codePointAt(0) 
							+ "=" + str1.compareTo(str2));
		
//		concat() : 두 문자열 결합하여 반환하는 메서드
		str1 = new String("가");
		str2 = new String("나");
		str3 = str1.concat(str2);
		System.out.println(str3);
		
//		contains() : 문자열 안에 매개변수로 전달한 문자열이 포함되어 있는지 확인하는 메서드
		str1 = new String("contains 메서드 예제");
		boolean res1 = str1.contains("메서드");
		boolean res2 = str1.contains("안녕");
		System.out.println(res1 + "/" + res2);
		
//		contentEquals() : 동일한 문자열 내용을 가지는지 확인하는 메서드
//						  Thread safe 기능이 사용되고 있어서 성능 저하가 발생할 수 있다.
		str1 = new String("contentEquals 메서드 예제");
		res1 = str1.contentEquals("contentEquals 메서드 예제");
		res2 = str1.contentEquals("contentEquals");
		System.out.println(res1 + "/" + res2);
		
//		endsWith(), startsWith() : 문자열에서 특정 문자열로 끝나거나 시작하는지 확인하는 메서드
		str1 = new String("endsWith(), startsWith() 메서드 예제");
		res1 = str1.endsWith("예제");
		res2 = str1.startsWith("end");
		System.out.println(res1 + "/" + res2);
		
//		equalsIgnoreCase() : 문자열을 대소문자 구분없이 같은지 확인하는 메서드
		str1 = new String("Hello");
		res1 = str1.equalsIgnoreCase("HELLO");
		res2 = str1.equalsIgnoreCase("hello");
		System.out.println(res1 + "/" + res2);
		
//		indexOf() : 매개변수로 전달한 문자열의 위치를 찾아 해당 index 값 반환하는 메서드
//		lastIndexOf() : 해당 문자열의 위치를 뒤에서부터 찾아서 값 반환
		str1 = new String("indexOf 메서드 사용 예제로 이 메서드는 메서드 오버로딩이 되어있습니다.");
		int index = str1.indexOf("메서드");
		System.out.println(index);
		index = str1.indexOf("메서드", 9);	// 9번 위치부터 확인
		System.out.println(index);
		index = str1.indexOf("메서드", 22);	// 22번 위치부터 확인
		System.out.println(index);
		index = str1.indexOf("메서드", 27);
		System.out.println(index);			// 못찾으면 -1 반환
		
		/*
		 * 	문자열에서 특정 문자열이 몇개 존재하는지 찾으시오.
		 */
		int idx = 0;
		count = 0;
		while(idx != -1) {
			idx = str1.indexOf("메서드", idx);
			if (idx == -1) {
				break;
			}
			count++; idx++;
		}
		System.out.println(count);
		
//		isBlank() : 문자열이 공백인거나 비어있을 때 true
//		isEmpty() : 빈 문자열일 때에만 true
		str1 = new String(" ");
		res1 = str1.isBlank();
		res2 = str1.isEmpty();
		System.out.println(res1 + "/" + res2);
		str1 = new String("\n");
		res1 = str1.isBlank();
		res2 = str1.isEmpty();
		System.out.println(res1 + "/" + res2);
		str1 = new String("");
		res1 = str1.isBlank();
		res2 = str1.isEmpty();
		System.out.println(res1 + "/" + res2);
		
//		lines() : 문자열에서 개행을 기준으로 문자열을 분리하여 반환하는 메서드
		str1 = new String("11 버전에서\n새로 생긴\nlines()\n메서드");
		Stream<String> stream = str1.lines();
		Object[] objArr = stream.toArray();
		for (int i = 0; i < objArr.length; i++) {
			String s = (String)objArr[i];
			System.out.println(i + 1 + "번 줄\t" + s);
		}
		
//		split() : 문자열을 지정한 분리자(string)를 기준으로 분리하여 문자열 배열로 반환하는 메서드
		str1 = new String("특정 문자를\n기준으로 분리하여\n문자열 배열로 반환하는\n메서드");
		String strArr[] = str1.split("\n");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(i + 1 + "번 줄\t" + strArr[i]);
		}
		
//		repeat()
		str1 = new String("Hello");
		str2 = str1.repeat(2);
		System.out.println(str2);
		
//		replace()
		str1 = new String("문자열을 변경하기 위해 사용하는 문자열 메서드");
		str2 = str1.replace("문자열", "String");
		System.out.println(str2);
		
//		strip(), trim()
		str1 = new String("	문자열 앞 뒤로 공백이 있으면 제거	");
		str2 = str1.trim();
		System.out.println("|" + str2 + "|");
		str2 = str1.strip();
		System.out.println("|" + str2 + "|");
		str2 = str1.stripLeading();			// 앞 공백 제거
		System.out.println("|" + str2 + "|");
		str2 = str1.stripTrailing();		// 뒤 공백 제거
		System.out.println("|" + str2 + "|");
		
//		substring() : (begin <= x < end)
		str1 = new String("문자열 일부만 잘라내기");
		str2 = str1.substring(0, 3);
		System.out.println(str2);
		str2 = str1.substring(4, 7);
		System.out.println(str2);
		str2 = str1.substring(4);
		System.out.println(str2);
		
//		toLowerCase(), toUpperCase()
		str1 = new String("HeLLo");
		str2 = str1.toLowerCase();
		System.out.println(str2);
		str2 = str1.toUpperCase();
		System.out.println(str2);
		
//		String.format("포맷문자열", 값...)
		str1 = String.format("%s / %d / %f", "문자열포맷", 30, 3.0);
		System.out.println(str1);
		
//		String.join("구분문자", 문자열배열)
//		String.join("구분문자", 문자열1, 문자열2, ...)
		str1 = String.join(",", new String[] {"A", "B", "C", "D"});
		System.out.println(str1);
		str1 = String.join("_", "A", "B", "C", "D");
		System.out.println(str1);
		
//		String.valueOf(다양한데이터값) : 입력값을 문자열로 변환
		str1 = String.valueOf(true);
		System.out.println(str1);
		str1 = String.valueOf(10);
		System.out.println(str1);
		str1 = "" + 10;
		System.out.println(str1);
		
	}

}
