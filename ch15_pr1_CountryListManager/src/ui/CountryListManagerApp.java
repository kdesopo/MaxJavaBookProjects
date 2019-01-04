package ui;

import java.util.ArrayList;
import java.util.List;

import business.CountryIO;

public class CountryListManagerApp {

	public static void main(String[] args) {
		System.out.println("Country List Manager");
		int choice = 0;
		CountryIO cio = new CountryIO();
		
		while(choice != 3) {
			Console.printMenu();
			choice = Console.getInt("\nEnter menu number: ", 1, 3);
			
			if(choice == 1) {
				if(cio.getCountries().isEmpty()) {
					Console.println("Error! No countries in file. " +
									"Add a country to the file and try again.");
				} else {
					Console.println("");
					for(String country:cio.getCountries()) {
						Console.println(country);
					}
				}
			} else if(choice == 2) {
				List<String> countries = new ArrayList<>();
				String entry = Console.getString("\nEnter a country: ");
				countries.add(entry);
				boolean saved = cio.saveCountries((ArrayList<String>)countries);
				
				if(saved) {
					Console.println(entry + " was saved.");
				} else {
					Console.println(entry + "save failed.");
				}
			}
		}

	}

}
