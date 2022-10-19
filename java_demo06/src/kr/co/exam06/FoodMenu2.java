package kr.co.exam06;

import java.util.Arrays;

public class FoodMenu2 {
//	멤버 변수
	private Food food[] = new Food[0];
	
//	생성자
	public FoodMenu2() {}
	
//	메뉴 출력 메서드
	public String printMenu() {
		String res = "";
		for(int i = 0; i < this.food.length; i++) {
			res += String.format("%s\t%,d원\n", this.food[i].name, this.food[i].price);
		}
		return res;
	}
	
//	메뉴의 위치 찾기 메서드
	private int findIndex(String food) {
		int idx = -1;
		for(int i = 0; i < this.food.length; i++) {
			if (food.equals(this.food[i].name)) {
				idx = i;
				break;
			}
		}
		return idx;
	}
	
//	음식 찾기 메서드
	/**
	 * name 매개변수에 전달된 문자열에 해당하는 메뉴를 찾아 가격 반환하는 메서드
	 * 해당하는 메뉴가 없는 경우 -1을 반환
	 * @param food : 메뉴명
	 * @return : 메뉴에 대한 가격을 반환
	 */
	public int findMenu(String food) {
		return this.food[this.findIndex(food)].price;
	}
	
//	음식 추가 메서드
	public void addMenu(String addName, int addPrice) {
		this.food = Arrays.copyOf(this.food, this.food.length + 1);
		this.food[this.food.length - 1] = new Food(addName, addPrice);
	}
	
//	음식 수정 메서드
	/**
	 * name에 해당하는 메뉴를 찾아서 price 가격으로 수정을 하는 메서드
	 * name에 해당하는 메뉴를 찾아서 수정한 경우 true 반환
	 * name에 해당하는 메뉴가 없는 경우 false 반환
	 * @param food : 가격을 수정할 메뉴명
	 * @param rePrice : 수정할 가격
	 * @return 
	 * 	true : 메뉴를 찾아서 가격 수정함
	 * 	false : 메뉴가 없어서 수정 못함
	 */
	public boolean changeMenu(String food, int rePrice) {
		int idx = this.findIndex(food);
		if(idx != -1) {
			this.food[idx].price = rePrice;
			return true;
		}
		return false;
	}
	
//	음식 삭제 메서드
	public boolean deleteMenu(String food) {
		int idx = this.findIndex(food);
		if (idx != -1) {
			for(int i = idx; i < this.food.length -1; i++) {
				this.food[i] = this.food[i+1];
				this.food = Arrays.copyOf(this.food, this.food.length - 1);
			}
			return true;
		}
		return false;
	}
}