package kr.co.exam;

public class Exam01 {

	public static void main(String[] args) {
//		배열 크기가 3인 정수 배열을 만들고 3부터 시작하는
//		3의 배수 값으로 초기화하세요.
		int arr1[] = new int[3];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = 3*(i+1);
		}
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}
		System.out.println();
		
//		배열 크기가 5인 정수 배열을 만들고 5부터 -1씩 
//		감소된 값으로 초기화한 후 출력하세요.
		int arr2[] = new int[5];
		int j = 5;
		while(j > 0) {
			arr2[5-j] = j;
			j--;
		}
		for(int k = 0; k < arr2.length; k++) {
			System.out.print(arr2[k] + "\t");
		}
		System.out.println();
	}

}
