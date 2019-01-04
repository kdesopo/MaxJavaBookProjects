package db;

import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.ArrayList;
import business.Conversion;

public class ConversionFile {
	private Path conversionPath;
	private File conversionFile;
	private List<Conversion> conversions;
	private final String FIELD_SEP = "\t";
	
	public ConversionFile() {
		conversionPath = Paths.get(System.getProperty("user.dir"),
				"src/db/conversion_types.txt");
		conversionFile = conversionPath.toFile();
		if(Files.notExists(conversionPath)) {
			System.out.println("conversion_types file doesn't exist.");
			System.out.println("Creating file in " + conversionPath);
			
			try {
				Files.createFile(conversionPath);
				conversionFile = conversionPath.toFile();
				PrintWriter out = new PrintWriter(
								  new BufferedWriter(
							      new FileWriter(conversionFile)));
				
				out.println("Miles" + FIELD_SEP + "Kilometers" + FIELD_SEP + 1.6093);
				out.println("Kilometers" + FIELD_SEP + "Miles" + FIELD_SEP + 0.6214);
				out.println("Inches" + FIELD_SEP + "Centimeters" + FIELD_SEP + 2.54);
				out.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
	
	public ArrayList<Conversion> getConversions() {
		if(conversions != null) {
			return (ArrayList<Conversion>)conversions;
		}
		
		try(BufferedReader in = new BufferedReader(
								new FileReader(conversionFile))) {
			conversions = new ArrayList<Conversion>();
			String line = in.readLine();
			
			while(line != null) {
				String[] contents = line.split(FIELD_SEP);
				String fromUnit = contents[0];
				String toUnit = contents[1];
				double conversionRatio = Double.parseDouble(contents[2]);
				Conversion c = new Conversion(fromUnit, toUnit, conversionRatio);
				conversions.add(c);
				line = in.readLine();
			}
			
			in.close();
			return (ArrayList<Conversion>)conversions;
			
		} catch(IOException e) {
			System.out.println(e);
			return null;
		}
	}
	
	public boolean saveConversions(ArrayList<Conversion> typesList) {
		try(PrintWriter out = new PrintWriter(
							  new BufferedWriter(
							  new FileWriter(conversionFile)))) {
			
			ArrayList<Conversion> newList = new ArrayList<>();
			for(Conversion type:typesList) {
				out.print(type.getFromUnit() + FIELD_SEP);
				out.print(type.getToUnit() + FIELD_SEP);
				out.println(type.getConversionRatio());
				newList.add(type);
			}
			
			conversions = newList;
			out.close();
			return true;
		} catch (IOException e) {
			System.out.println(e);
			return false;
		}
	}
	
	public Path getConversionPath() {
		return conversionPath;
	}
	public void setConversionPath(Path conversionPath) {
		this.conversionPath = conversionPath;
	}
	public File getConversionFile() {
		return conversionFile;
	}
	public void setConversionFile(File conversionFile) {
		this.conversionFile = conversionFile;
	}
	
	public void setConversions(List<Conversion> conversions) {
		this.conversions = conversions;
	}	
}
