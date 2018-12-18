
public class PersonManagerApp {
	public static void main(String[] args) {
		System.out.println("Welcome to the Person Manager");
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			String persontype = Console.getPersonType("Create customer or employee? (c/e): ");
			
			Person p = Console.createPerson();
			
			if (persontype.equalsIgnoreCase("c")) {
				Customer c = 
					new Customer(p.getFirstname(), p.getLastname(), Console.getPersonNum("c"));
				p = c;
			} else {
				Employee e = 
					new Employee(p.getFirstname(), p.getLastname(), Console.getPersonNum("e"));
			p = e;
			}
			
			Console.printPerson(persontype, p);
			
			choice = Console.getString("Continue? (y/n): ");
		}
	}
}
