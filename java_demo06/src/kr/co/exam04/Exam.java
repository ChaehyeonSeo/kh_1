package kr.co.exam04;

public class Exam {

	public static void main(String[] args) {
		Speaker s1 = new Speaker(110, false, true);
//		s1.volumeUp();
//		s1.volumeUp();
//		s1.volumeDown();
//		s1.switchMute();
//		s1.switchMute();
//		s1.switchPower();
//		s1.switchPower();
		System.out.println(s1.getInfo());
		
		Speaker s2 = new Speaker();
		System.out.println(s2.getInfo());
	}

}
