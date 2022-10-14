package kr.co.demo;

public class Demo06 {

	public static void main(String[] args) {
		/*
		 * 	2 차 배열
		 * 		배열 안에 배열이 중첩되어 사용하는 것.
		 * 		중첩 횟수에 따라 n 차 배열이라 할 수 있지만
		 * 		통틀어 2 차 배열이라 함.
		 * 
		 * 	작성 방법
		 * 		int arr[][];
		 * 		int [][] arr;
		 * 
		 * 		int arr[][] = new int[행크기][열크기];
		 * 		int arr[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		 * 
		 * 	사용 방법
		 * 		arr[행인덱스][열인덱스];
		 */
		
		int arr1[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		
		System.out.printf("arr1[%d][%d] -> %d\n", 2, 1, arr1[2][1]);
		
//		반복문을 사용하여 전체 탐색
		System.out.println("arr1 -> " + arr1);
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("arr1[%d] -> " + arr1[i] + "\n", i);
			for(int j = 0; j < arr1.length; j++) {
				System.out.printf("arr1[%d][%d] -> %d\n", i, j, arr1[i][j]);
			}
		}
	}

}
