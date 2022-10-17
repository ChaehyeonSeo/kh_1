package kr.co.demo03;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(15);
		
		System.out.println(Circle.PI2);
		System.out.printf("반지름이 %.2f인 원의 넓이는 %.2f\n", c1.getRadius(), c1.getArea());
		System.out.printf("반지름이 %.2f인 원의 넓이는 %.2f\n", c2.getRadius(), c2.getArea());
	}

}
