package kr.co.exam06;

public class Exam {

	public static void main(String[] args) {
		FoodMenu m1 = new FoodMenu();
		
		m1.addMenu("김치볶음밥", 6000);
		m1.addMenu("참치김밥", 4000);
		m1.addMenu("치즈김밥", 3500);
		m1.addMenu("기본김밥", 3000);
		
		m1.printMenu();
		System.out.println();
		
		m1.findMenu("참치김밥");
		System.out.println();
		
		m1.changeMenu("참치김밥", 4500);
		m1.printMenu();
		System.out.println();
		
		m1.deleteMenu("기본김밥");
		m1.printMenu();
	}

}
