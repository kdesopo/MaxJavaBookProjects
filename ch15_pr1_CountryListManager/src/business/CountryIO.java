package business;

import db.CountriesTextFile;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class CountryIO {
	private CountriesTextFile ctf;
	
	public CountryIO() {
		ctf = new CountriesTextFile();
		
		if(Files.notExists(ctf.getCountriesPath())) {
			System.out.println("\nCountries file doesn't exist.");
			System.out.println("Creating it in " + ctf.getCountriesPath());
			try {
				Path p = Files.createFile(ctf.getCountriesPath());
				ctf.setCountriesFile(p.toFile());
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
	
	public ArrayList<String> getCountries() {
		if(ctf.getContents() != null) {
			return (ArrayList<String>)ctf.getContents();
		}
		
		try(BufferedReader in = new BufferedReader(
								new FileReader(ctf.getCountriesFile()))) {
			
			String line = in.readLine();
			ArrayList<String> countriesList = new ArrayList<>();
			
			while(line != null) {
				countriesList.add(line);
				line = in.readLine();
			}
			
			ctf.setContents(countriesList);
			
			return countriesList;
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		return null;
	}
	
	public boolean saveCountries(ArrayList<String> countries) {	
		try(PrintWriter out = new PrintWriter(
							  new BufferedWriter(
							  new FileWriter(ctf.getCountriesFile(), true)))) {
			
			List<String> newContents = ctf.getContents();
			
			for(String country:countries) {
				out.println(country);
				newContents.add(country);
			}
			
			ctf.setContents(newContents);
			return true;
			
		} catch (IOException e) {
			System.out.println(e);
			return false;
		}
	}
}
