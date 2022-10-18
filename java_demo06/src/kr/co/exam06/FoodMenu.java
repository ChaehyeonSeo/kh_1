package kr.co.exam06;

import java.util.Arrays;

public class FoodMenu {
//	멤버 변수
	private String menu[] = new String[0];
	private int price[] = new int[0];
	
//	생성자
	public FoodMenu() {}
	
//	메뉴 출력 메서드
	public void printMenu() {
		for(int i = 0; i < menu.length; i++) {
			System.out.println(menu[i] + "\t" + price[i]);
		}
	}
	
//	음식 찾기 메서드
	public void findMenu(String food) {
		for(int i = 0; i < menu.length; i++) {
			if (food == menu[i]) {
				System.out.println(price[i]);
			}
		}
	}
	
//	음식 추가 메서드
	public void addMenu(String addName, int addPrice) {
		this.menu = Arrays.copyOf(menu, menu.length + 1);
		this.price = Arrays.copyOf(price, price.length + 1);
		menu[menu.length - 1] = addName;
		price[price.length - 1] = addPrice;
	}
	
//	음식 수정 메서드
	public void changeMenu(String food, int rePrice) {
		for(int i = 0; i < menu.length ; i++) {
			if (food == menu[i]) {
				price[i] = rePrice;
			}
		}
	}
	
//	음식 삭제 메서드
	public void deleteMenu(String food) {
		for(int i = 0; i < menu.length; i++) {
			if (food == menu[i]) {
				for(int j = i; j < menu.length - 1; j++) {
					menu[j] = menu[j+1];
				}
				for(int j = i; j < menu.length - 1; j++) {
					price[j] = price[j+1];
				}
				menu = Arrays.copyOf(menu, menu.length - 1);
				price = Arrays.copyOf(price, price.length - 1);
			}
		}
	}
}
