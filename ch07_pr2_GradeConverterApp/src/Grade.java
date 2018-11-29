
public class Grade {
	private int number;

	public Grade() {
		this.number = 0;
	}
	
	public Grade(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getLetter() {
		if(this.getNumber() >= 88) {
			return "A";
		} else if(this.getNumber() > 79) {
			return "B";
		} else if(this.getNumber() > 67) {
			return "C";
		} else if(this.getNumber() >= 60) {
			return "D";
		} else {
			return "F";
		}
	}
}
