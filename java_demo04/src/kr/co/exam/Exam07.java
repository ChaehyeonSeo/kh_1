package kr.co.exam;

public class Exam07 {

	public static void main(String[] args) {
//		다음과 같은 모양의 출력을 만들어 보세요.
//		1	2	3	4	5
//		6	7	8	9	10
//		11	12	13	14	15
//		16	17	18	19	20
//		21	22	23	24	25
//		
//		숫자 사이의 공백은 space가 아닌 tab(\t)로 만드세요.
		
		int i, j;
		for(i = 0; i <= 4; i++) {
			for(j = 1; j <= 5; j++) {
				System.out.printf("%d\t", 5*i + j);
			}
			System.out.println();
		}
		
//		1 ~ 31 까지의 숫자를 달력 형태처럼 출력하세요.
//		1	2	3	4	5	6	7
//		8	9	10	11	12	13	14
//		15	16	17	18	19	20	21
//		22	23	24	25	26	27	28
//		29	30	31
//		숫자 사이의 공백은 tab
//		반드시 중첩 반복문이 아니어도 됨
		
		int k;
		for(k = 1; k <= 31; k++) {
			System.out.printf("%d\t", k);
			if (k % 7 == 0) {
				System.out.print("\n");
			}
		}
		
	}

}
