package kr.co.exam04;

public class Speaker {
//	멤버변수
	private int volume;
	private boolean mute;
	private boolean power;
//	생성자
	public Speaker() {}
	public Speaker(int volume, boolean mute, boolean power) {
		this.setVolume(volume);
		this.mute = mute;
		this.power = power;
	}
	public Speaker(boolean mute, boolean power) {
//		this.mute = mute;
//		this.power = power;
		this(50, mute, power);
	}
	public Speaker(int volume) {
		this(volume, false, false);
	}
	
	private void setVolume(int volume) {
		if(volume >= 0 && volume <= 100) {
			this.volume = volume;
		} else {
			this.volume = 0;
		}
	}
//	음량 키움/줄임 메서드
	public void volumeUp() {
		if(this.volume + 5 <= 100) {
		this.volume += 5;
		} else {
			this.volume = 100;
		}
	}
	public void volumeDown() {
		if (this.volume - 5 >= 0) {
			this.volume -= 5;
		} else {
			this.volume = 0;
		}
	}
//	음소거 on/off 메서드
	public void switchMute() {
		this.mute = !this.mute;
	}
	
//	전원 on/off 메서드
	public void switchPower() {
		this.power = !this.power;
	}
	
//	현재상태정보 메서드
	public String getInfo() {
		if (!this.power) {
			return "전원 OFF";
		} else if (this.mute) {
			return "음소거";
		} else {
			return "음량 " + this.volume;
		}
	}
}
