package com.kh.test.money.run;

import com.kh.test.money.model.vo.Money;

public class Run {
	public static void main(String[] args) {
		Money m = new Money(0);
		m.setMoney(10000);
		m.print();
	}

}



/*
 * 	1. 다이어그램에서 멤버변수 money의 접근제한자를 private으로 설정하라 했으나,
 * 		작성된 코드에서는 public으로 작성되어있다.
 * 	2. 매개변수가 int인 생성자만 만들었는데, 기본생성자로 인스턴스를 생성하려 하였다.
 * 	3. getMoney메소드와 print메소드에서 this.가 생략되었다.
 * 	4. 필드 선언 시, UNIT을 멤버 상수로 선언해서 setter 메서드를 작성할 수 없다.
 */

/*
 * 	1. public int money; -> private int money;
 * 	2. Run.java의 Money m = new Money(); -> Money m = new Money(0);
 * 	3. return money; -> return this.money;
 * 		System.out.println(money + UNIT + "이 있습니다.");
 * 		-> System.out.println(this.money + UNIT + "이 있습니다.");
 * 	4. 	public static final String UNIT = "원";
 * 		-> public static String UNIT = "원";
 * 		UNIT 변수에 대한 setter 메서드 작성
 * 		public void setUnit(String UNIT) {
			this.UNIT = UNIT;
		}
 */