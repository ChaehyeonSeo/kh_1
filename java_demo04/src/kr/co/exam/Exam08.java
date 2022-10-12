package kr.co.exam;

public class Exam08 {

	public static void main(String[] args) {
//		1
//		2	3
//		4	5	6
//		7	8	9	10
//		11	12	13	14	15
		
		int i, j;
		int sum = 0;
		for(i = 0; i <= 4; i++) {
			sum += i;
			for(j = 1; j <= i+1; j++) {
				System.out.printf("%d\t", sum+j);
			}
			System.out.println();
		}
		
	}

}
