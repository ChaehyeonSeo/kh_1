package kr.co.demo02;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		/*
		 * 
		 */
		
		HashSet<Integer> aSet = new HashSet<Integer>();
		
//		데이터 추가
		aSet.add(Integer.valueOf(10)); aSet.add(Integer.valueOf(20));
		aSet.add(Integer.valueOf(30)); aSet.add(Integer.valueOf(40));
		aSet.add(Integer.valueOf(50)); aSet.add(Integer.valueOf(60));
		
		System.out.println(aSet);
		
//		데이터 검색
		boolean isExists = aSet.contains(Integer.valueOf(20));
		System.out.println("정수 20이 있습니까? -> " + isExists);
		
//		데이터 삭제
		aSet.remove(Integer.valueOf(20));
		System.out.println(aSet);
		
//		크기 확인
		int size = aSet.size();
		System.out.println("컬렉션에 저장된 데이터 수 : " + size);
		
//		Set을 List로 변경
		ArrayList<Integer> aList = new ArrayList<Integer>(aSet);
		System.out.println(aList);
		
//		List를 Set으로 변경
		HashSet<Integer> bSet = new HashSet<Integer>(aList);
		System.out.println(bSet);
		
	}

}
