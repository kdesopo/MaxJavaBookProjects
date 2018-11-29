
public class ContactListApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Contact List application");
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			String firstname = Console.getString("Enter first name: ");
			String lastname = Console.getString("Enter last name: ");
			String email = Console.getEmail("Enter email: ");
			String phone = Console.getPhone("Enter phone: ");
			
			Contact contact = new Contact(firstname, lastname, email, phone);

			System.out.println(contact.displayContact());
			choice = Console.getString("Continue? (y/n): ");
		}

	}

}
