package ui;

import java.util.ArrayList;
import db.MovieIO;

public class MovieListApp {

	public static void main(String[] args) {
		String choice = "y";
		String[] genres = {"drama", "musical", "scifi", "horror", "comedy", "animated"};
		ArrayList<String> types = new ArrayList<>();
		for(String genre : genres) {
			types.add(genre);
		}
		MovieIO mdb = new MovieIO();
		
		System.out.println("The Movie List application");
		System.out.println("Choose from 100 movies");
		
		while (choice.equals("y")) { 
			System.out.println("Categories: drama | musical | scifi | horror | comedy | animated");
			String category = Console.getString("\nEnter a category: ", types);	
			Console.printMoviesByCat(mdb.getMovies(category));
			choice = Console.getString("\nContinue? (y/n): ", "y", "n");
		}
		
		System.out.println("\nBye!");
	}

}
