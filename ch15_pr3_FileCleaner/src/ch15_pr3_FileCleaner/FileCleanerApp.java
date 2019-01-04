package ch15_pr3_FileCleaner;

import java.nio.file.*;
import java.io.*;

public class FileCleanerApp {
	public static void main(String[]args) {
		System.out.println("File Cleaner");
		System.out.println("\nSource file: prospects.csv");
		
		String dir = System.getProperty("user.dir");
		Path filePath = Paths.get(dir, "src/prospects.csv");
		Path cleanPath = Paths.get(dir, "src/prospects_clean.csv");
		String newContent = "";
		
		if(Files.notExists(cleanPath)) {
			try {
				Files.createFile(cleanPath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		File file = filePath.toFile();
		File cleanFile = cleanPath.toFile();
		
		try(BufferedReader in = new BufferedReader(
								new FileReader(file))) {
			String line = in.readLine();
			while(line != null) {
				String[]entries = line.split(",");
				
				for(int i = 0; i < entries.length; i++) {
					String word = entries[i];
					if(word.contains("@")) {
						newContent = newContent + word.trim().toLowerCase() + "\n";
					} else if(word.equalsIgnoreCase("email")){
						newContent = newContent + toProperCase(word.trim()) + "\n";
					} else {
						newContent = newContent + toProperCase(word.trim()) + ",";
					}
				}
				
				line = in.readLine();
			}
			
			try(PrintWriter out = new PrintWriter(
					  new BufferedWriter(
					  new FileWriter(cleanFile)))) {
				out.println(newContent);
			}
			System.out.println("Cleaned file: prospects_clean.csv");
			System.out.println("\nCongratulations! Your file has been cleaned!");
			
		} catch(IOException e) {
			System.out.println(e);
		}
	}
	
	public static String toProperCase(String word) {
		char[] charLetters = word.toCharArray();
		String[] letters = new String[charLetters.length];
		String pCase = "";
		
		for(int i = 0; i < charLetters.length; i++) {
			letters[i] = charLetters[i] + "";
			
			if(i==0) {
				letters[i] = letters[i].toUpperCase();
			} else {
				letters[i] = letters[i].toLowerCase();
			}
			
			pCase = pCase + letters[i];
			
		}
		return pCase;
	}
}
