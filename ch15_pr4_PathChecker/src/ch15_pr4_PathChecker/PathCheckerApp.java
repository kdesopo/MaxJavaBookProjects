package ch15_pr4_PathChecker;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PathCheckerApp {

	public static void main(String[] args) {
		System.out.println("Path Checker");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		String root = System.getProperty("user.home");
		
		while(choice.equalsIgnoreCase("y")) {
			System.out.print("\nEnter a path: ");
			String input = sc.nextLine();
			
			Path path = Paths.get(root, input);
			
			if(Files.exists(path)) {
				if(Files.isDirectory(path)) {
					System.out.println("\nThat path points to a directory.");
				} else if(Files.isRegularFile(path)) {
					System.out.println("\nThat path points to a file.");
				}
			} else {
				System.out.println("\nThat path doesn't exist.");
				sc.nextLine();
			}

			System.out.print("\nContinue? (y/n): ");
			choice = sc.nextLine();
		}
		
		sc.close();
	}

}
