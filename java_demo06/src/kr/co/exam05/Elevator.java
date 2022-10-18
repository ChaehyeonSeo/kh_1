package kr.co.exam05;

public class Elevator {
	
//	멤버변수
	private int floor = 1;
	private int minFloor;
	private int maxFloor;
	private int changeFloor;
	
//	생성자
	public Elevator(int maxFloor) {
		this.maxFloor = maxFloor;
	}
	public Elevator(int minFloor, int maxFloor) {
		this.minFloor = minFloor;
		this.maxFloor = maxFloor;
	}
	
//	이동 메서드
//	public void moveFloor(int changeFloor) {
//		if (changeFloor <= maxFloor && changeFloor >= minFloor) {
//			if (floor == changeFloor) {
//				System.out.println("현재층에서 이동이 없습니다.");
//			} else if (floor < changeFloor) {
//				this.floor = changeFloor; 
//				System.out.println("현재층에서 " + changeFloor + "층으로 올라갑니다.");
//			} else {
//				this.floor = changeFloor; 
//				System.out.println("현재층에서 " + changeFloor + "층으로 내려갑니다.");
//			}
//		} else {
//			changeFloor = 1;
//			System.out.println("이동할 수 없습니다. 현재층에서 " + changeFloor + "층으로 내려갑니다.");
//		}
//	}
	public String moveFloor(int changeFloor) {
		if (changeFloor <= maxFloor && changeFloor >= minFloor) {
			if (floor == changeFloor) {
				return "현재층에서 이동이 없습니다.";
			} else if (floor < changeFloor) {
				this.floor = changeFloor; 
				return "현재층에서 " + changeFloor + "층으로 올라갑니다.";
			} else {
				this.floor = changeFloor; 
				return "현재층에서 " + changeFloor + "층으로 내려갑니다.";
			}
		} else {
			changeFloor = 1;
			return "현재층에서 " + changeFloor + "층으로 내려갑니다.";
		}
	}
}
