package business;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Parser {
	
	public static String parse(String text) {
		String[] words = text.split(" ");
		
		for(int i = 0; i < words.length; i++) {
			String curWord = words[i];
			curWord = curWord.toLowerCase();
			Pattern punct = Pattern.compile("[.!?]$");
			Matcher mpunct = punct.matcher(curWord);
			curWord = mpunct.replaceAll("");
			
			Pattern numsymbols = Pattern.compile("[0-9|\\W]");
			Matcher m = numsymbols.matcher(curWord);
			
			Pattern contract = Pattern.compile("'");
			Matcher mcontract = contract.matcher(curWord);
			
			
			
			if(mcontract.find() || !m.find()) {
				Pattern vowels = Pattern.compile("^[aeiou]");
				m = vowels.matcher(curWord);
				if(m.find()) {
					words[i] = curWord + "way";
				} else {
					Pattern consonants = Pattern.compile("[aeiouy]");
					m = consonants.matcher(curWord);
					m.find();
					words[i] = curWord.substring(m.start()) + curWord.substring(0, m.start()) + "ay";
				}
			}
		}
		
		String pigLatin = "";
		for(String word : words) {
			pigLatin += word + " ";
		}
		
		return pigLatin;
	}
}
