package ui;

import java.util.ArrayList;
import db.WizardDB;

public class WizardInventoryApp {

	public static void main(String[] args) {
		String command = "";
		String[]commands = {"show", "grab", "edit", "drop", "exit"};
		ArrayList<String> validCommands = new ArrayList<>();
		for(String action:commands) {
			validCommands.add(action);
		}
		WizardDB wiz = new WizardDB();
		
		System.out.println("The Wizard Inventory game");

		
		while(!command.equals("exit")) {
			System.out.println("\nCOMMAND MENU\n"
					+ "show - Show all items\n"
					+ "grab - Grab an item\n"
					+ "edit - Edit an item\n"
					+ "drop - Drop an item\n"
					+ "exit - Exit program\n"); 
			
			command = Console.getString("Command: ", validCommands);
			
			if(command.equals("show")) {
				Console.printItems(wiz);
			} else if (command.equals("grab")) {
				wiz.grabItem();
			} else if (command.equals("edit")) {
				int n = Console.getInt("Number: ", 1, wiz.getItems().size());
				String name = Console.getString("Updated name: ");
				wiz.editItem(n, name);
			} else if (command.equals("drop")) {
				int n = Console.getInt("Number: ", 1, wiz.getItems().size());
				wiz.dropItem(n);
			}
		}
		
		System.out.println("Bye!");

	}
}
