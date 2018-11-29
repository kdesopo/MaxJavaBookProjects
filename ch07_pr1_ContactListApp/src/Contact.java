
public class Contact {
	private String firstname;
	private String lastname;
	private String email;
	private String phone;
	
	public Contact() {
		this.firstname = "";
		this.lastname = "";
		this.email = "";
		this.phone = "";
	}
	
	public Contact(String firstname, String lastname, String email, String phone) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String displayContact() {
		String output = "\n" + "--Current Contact--" + "\n" + 
				 "First name: " + this.getFirstname() + "\n" +
				 "Last name: " + this.getLastname() + "\n" +
				 "Email: " + this.getEmail() + "\n" +
				 "Phone: " + this.getPhone() +
				 "\n";
		
		return output;
	}
}