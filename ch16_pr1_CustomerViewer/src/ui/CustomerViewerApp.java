package ui;

import java.util.Scanner;
import business.Customer;
import db.CustomerDB;
import db.NoSuchCustomerException;

public class CustomerViewerApp {

	public static void main(String[] args) {
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Customer Viewer");
		
		while(choice.equalsIgnoreCase("y")) {
			System.out.print("\nEnter a customer number: ");
			if(sc.hasNextInt()) {
				int custNum = sc.nextInt();
				try {
					Customer c = CustomerDB.getCustomer(custNum);
					System.out.println(c.getNameAndAddress());
				} catch(NoSuchCustomerException e) {
					System.out.println("\nNo customer found for number " + custNum + ".");
					sc.nextLine();
					continue;
				}
			} else {
				System.out.println("Error! That's not a number. Try again.");
				sc.nextLine();
				continue;
			}
			System.out.print("\nDisplay another customer? (y/n): ");
			choice = sc.next();
			
		}
		
		sc.close();
		System.out.println("Bye!");

	}

}
