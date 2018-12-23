package ui;

import business.Parser;

public class PigLatinTranslatorApp {

	public static void main(String[] args) {
		String choice = "y";
		System.out.println("Pig Latin Translator");
		
		while(choice.equalsIgnoreCase("y")) {
			String line = Console.getString("\nEnter a line: ");
			System.out.println(Parser.parse(line));
			choice = Console.getString("\nAnother line? (y/n): ");
		}
		
		System.out.println("\nBye!");

	}
}
