package db;

import java.nio.file.*;
import java.util.List;
import java.io.*;

public class CountriesTextFile {
	private Path countriesPath = null;
	private File countriesFile = null;
	private List<String> contents = null;
	
	public CountriesTextFile() {
		countriesPath = Paths.get(System.getProperty("user.dir"), 
				"/src/db/countries.txt");
		
		countriesFile = countriesPath.toFile();
	}

	public Path getCountriesPath() {
		return countriesPath;
	}

	public void setCountriesPath(Path countriesPath) {
		this.countriesPath = countriesPath;
	}

	public File getCountriesFile() {
		return countriesFile;
	}

	public void setCountriesFile(File countriesFile) {
		this.countriesFile = countriesFile;
	}

	public List<String> getContents() {
		return contents;
	}

	public void setContents(List<String> contents) {
		this.contents = contents;
	}
	
	
}
