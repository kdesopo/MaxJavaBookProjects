
public class Employee extends Person {
	private String ssn;
	
	public Employee (String first, String last, String ssn) {
		super(first, last);
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn.substring(0, ssn.length()-4).replaceAll("[0-9]", "x") + 
				ssn.substring(ssn.length()-4);
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + "SSN: " + this.getSsn() + "\n";
	}
	
}
