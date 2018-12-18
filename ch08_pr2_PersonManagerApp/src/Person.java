
public class Person {
	private String firstname = "";
	private String lastname = "";
	
	public Person(String first, String last) {
		this.firstname = first;
		this.lastname = last;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@Override
	public String toString() {
		return "Name: " + firstname + " " + lastname;
	}
}
