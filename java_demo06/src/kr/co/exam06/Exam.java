package kr.co.exam06;

public class Exam {

	public static void main(String[] args) {
		FoodMenu m1 = new FoodMenu();
		
		m1.addMenu("김치볶음밥", 6000);
		m1.addMenu("참치김밥", 4000);
		m1.addMenu("치즈김밥", 3500);
		m1.addMenu("기본김밥", 3000);
		
		System.out.println(m1.printMenu());
		
		System.out.println(m1.findMenu("참치김밥"));
		System.out.println();
		
		System.out.println(m1.changeMenu("참치김밥", 4500));
		System.out.println(m1.printMenu());
		
		System.out.println(m1.deleteMenu("치즈김밥"));
		System.out.println(m1.printMenu());
		System.out.println("------------------");
		
		FoodMenu2 m2 = new FoodMenu2();
		m2.addMenu("라면", 4000);
		m2.addMenu("치즈라면", 4500);
		m2.addMenu("떡라면", 5000);
		m2.addMenu("김치라면", 6500);
		
		System.out.println(m2.printMenu());
		
		System.out.println(m2.changeMenu("치즈라면", 4000));
		System.out.println(m2.printMenu());
		
		System.out.println(m2.deleteMenu("떡라면"));
		System.out.println(m2.printMenu());
		
		System.out.println(m2.findMenu("라면"));
	}

}
