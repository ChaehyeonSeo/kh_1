package kr.co.exam02;

public class Exam {

	public static void main(String[] args) {
		/*
		 * 	삼각형, 사각형 클래스를 만들고 각 도형의 넓이와
		 * 	둘레를 구할 수 있도록 만드세요.
		 * 
		 * 	1.	두 클래스의 생성자는 밑변 정보만 받아서 생성하는 생성자와
		 * 		밑변과 높이 정보를 받아서 생성하는 생성자로 만드세요.
		 * 
		 * 	2.	생성자로 만들어진 삼각형, 사각형 인스턴스는 넓이와 둘레가
		 * 		바로 초기화되어 각 멤버필드에 저장될 수 있도록 하세요.
		 * 
		 * 	3.	getter 메서드만을 만들어서 밑변, 높이, 넓이, 둘레 정보만
		 * 		사용할 수 있도록 하세요.
		 */
		
		Quadrangle q1 = new Quadrangle(10);
		Triangle t1 = new Triangle(10);
		
		Quadrangle q2 = new Quadrangle(10, 15);
		Triangle t2 = new Triangle(10,15);
		
		System.out.println("밑변이 " + q1.getBase() + "인 사각형의 넓이는 " + q1.getArea()
		+ "이고, 둘레는 " + q1.getCircum());
		System.out.println("밑변이 " + t1.getBase() + "인 삼각형의 넓이는 " + t1.getArea()
		+ "이고, 둘레는 " + t1.getCircum());
		System.out.println("밑변이 " + q2.getBase() + "이고, 높이가 " + q2.getHeight()
		+ "인 사각형의 넓이는 " + q2.getArea()+ "이고, 둘레는 " + q2.getCircum());
		System.out.println("밑변이 " + t2.getBase() + "이고, 높이가 " + t2.getHeight()
		+ "인 삼각형의 넓이는 " + t2.getArea()+ "이고, 둘레는 " + t2.getCircum());
	}

}
