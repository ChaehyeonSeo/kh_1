package kr.co.exam02;

public class Phone {
	
	private String number;
	private boolean valid;
	
	private Phone(String phone) {
		this.check(phone);
	}
	
	public boolean isValid() {
		return this.valid;
	}
	
	public String getNumber() {
		return this.number;
	}
	
	public String getNumber(boolean hidden) {
		if(this.valid) {
			if (hidden) {
				return this.number.substring(0,9);
			}
		}
		return number;
	}

	private void check(String phone) {
		// TODO Auto-generated method stub
		
	}

	public static Phone valueOf(String input) {
		// TODO Auto-generated method stub
		return null;
	}
}
