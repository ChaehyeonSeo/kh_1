package kr.co.demo;

public class Demo02 {
	
	public static void main(String[] args) {
//		상수 : 변수 공간에는 언제든 데이터를 수정할 수 있다.
//			  하지만 상수는 한 번 초기화하면 더 이상 수정할 수 없는
//			  공간으로 사용되며, 변수와 상수를 구분하기 위해
//			  상수는 상수명을 대문자로만 작성
//			  2단어 이상의 조합의 상수명은 단어 사이에 _를 넣어 작성
//			  변수를 사용하는 방식과 동일하며, 자료형 앞에 final 키워드를 붙이면 됨

		final int X = 10;
		
		System.out.print(X);

//		final int Y = 20;
//		Y = 30;
		
		final int Y;
		Y = 20;
		System.out.print(Y);

		
	}

}
