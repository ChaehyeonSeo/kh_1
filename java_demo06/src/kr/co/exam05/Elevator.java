package kr.co.exam05;

public class Elevator {
	
//	멤버변수
	private int floor = 1;
	private int minFloor;
	private int maxFloor;
	private int changeFloor;
	private String state;
	
//	생성자
	public Elevator(int maxFloor) {
		this.maxFloor = maxFloor;
	}
	public Elevator(int minFloor, int maxFloor) {
		this.minFloor = minFloor;
		this.maxFloor = maxFloor;
	}
	
//	이동 메서드
	public void moveFloor(int changeFloor) {
		if (changeFloor <= maxFloor && changeFloor >= minFloor) {
			this.state = this.floor < changeFloor ? "올라" : "내려";
			if (floor == changeFloor) {
				System.out.println(this.floor + "층에서 이동이 없습니다.");
			} else {
				System.out.println(this.floor + "층에서 " + changeFloor + "층으로 " + this.state + "갑니다.");
				this.floor = changeFloor; 
			}
		} else {
			changeFloor = 1;
			System.out.println("이동할 수 없습니다. " + changeFloor + "층으로 갑니다.");
		}
	}
}
