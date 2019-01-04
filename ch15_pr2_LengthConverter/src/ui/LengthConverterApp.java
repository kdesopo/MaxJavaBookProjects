package ui;

import db.ConversionFile;

import java.util.ArrayList;

import business.Conversion;

public class LengthConverterApp {

	public static void main(String[] args) {
		Console.println("Length Converter");
		int choice = 0;
		ConversionFile cf = new ConversionFile();
		
		while(choice != 4) {
			Console.println("\n1 - Convert a length");
			Console.println("2 - Add a type of conversion");
			Console.println("3 - Delete a type of conversion");
			Console.println("4 - Exit");
			
			choice = Console.getInt("\nEnter menu number: ", 1, 4);
			
			if(choice == 1) {
				int counter = 1;
				ArrayList<Conversion> cnvList = cf.getConversions();
				Console.println("");
				
				for(Conversion type:cnvList) {
					String fromUnit = type.getFromUnit();
					String toUnit = type.getToUnit();
					double ratio = type.getConversionRatio();
					
					Console.println(counter + " - " + fromUnit + " to " +
					toUnit + ": " + ratio);
					
					counter++;
				}
				
				int choice2 = Console.getInt("\nEnter conversion menu number: ", 1, 
											cf.getConversions().size());
				
				Conversion curCnv = cnvList.get(--choice2);
				
				double fromValue = Console.getDouble("\nEnter " + curCnv.getFromUnit() + 
													 ": ", 0.0);
				curCnv.setFromValue(fromValue);
				curCnv.convert();
				Console.println(fromValue + " " + curCnv.getFromUnit() +
						" = " + curCnv.getformattedToValue() + " " + 
						curCnv.getToUnit());
				
			} else if(choice == 2) {
				String fromUnit = Console.getString("\nEnter 'From' unit: ");
				String toUnit = Console.getString("Enter 'To' unit: ");
				double ratio = Console.getDouble("Enter the conversion ratio: ", 0.0);
				Conversion newCnv = new Conversion(fromUnit, toUnit, ratio);
				ArrayList<Conversion> entries = cf.getConversions();
				
				entries.add(newCnv);
				boolean saved = cf.saveConversions(entries);
				
				if(saved) {
					Console.println("\nThis entry was saved.");
				} else {
					Console.println("\nError! Entry failed to save.");
				}
			} else if(choice == 3) {
				boolean saved = false;
				while(!saved) {
					String fromUnit = Console.getString("\nEnter 'From' unit: ");
					String toUnit = Console.getString("Enter 'To' unit: ");
					
					ArrayList<Conversion> cnvList = cf.getConversions();
					Conversion delete = null;
					
					for(Conversion entry:cnvList) {
						if(fromUnit.equalsIgnoreCase(entry.getFromUnit()) && 
								toUnit.equalsIgnoreCase(entry.getToUnit())) {
							delete = entry;
						}
					}
						
						if(delete == null) {
							saved = false;
						} else {
							cnvList.remove(delete);
							saved = cf.saveConversions(cnvList);
						}
						
						if(saved) {
							Console.println("\nThis entry was deleted.");
						} else {
							Console.println("\nDeletion failed. Check spelling and try again.");
						}
				}
			}
		}
		Console.println("\nGoodbye.");
		}
	}
