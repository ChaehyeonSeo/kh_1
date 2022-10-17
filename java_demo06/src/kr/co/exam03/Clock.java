package kr.co.exam03;

public class Clock {
	private int hour;
	private int minute;
	private int second;
	private String timeString;
	
	public Clock(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.timeString = this.hour + ":" + this.minute + ":" + this.second;
	}
	
	public String getTimeString() {
		return this.timeString;
	}
}
