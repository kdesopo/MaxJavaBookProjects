package ui;

public class EmailCreatorApp {

	public static void main(String[] args) {
		String[] csv = {"	james	,butler,jbutler@gmail.com", 
						"Josephine,Darakjy,Josephine_Darakjy@darakjy.org",
						"ART,VENERE,ART@VENERE.ORG"};
		String template = 
				"To:		{email}\n" +
				"From:		noreply@deals.com\n" +
				"Subject:	Deals!\n\n" +
				"Hi {first_name},\n\n" +
				"We've got some great deals for you. Check out our website!";
		
		String firstName;
		String lastName;
		String email;
		
		System.out.println("Email Creator");
		System.out.println("==================================================================");
		
		for(String entry : csv) {
			String[] person = entry.split(",");
			firstName = toTitleCase(person[0].trim());
			email = person[2].toLowerCase();
			String mailMerge = template.replace("{email}", email);
			mailMerge = mailMerge.replace("{first_name}", firstName);
			System.out.println(mailMerge);
			System.out.println("==================================================================");
			
		}
		

	}
	
	public static String toTitleCase(String word) {
		char[] letters = word.toCharArray(); 
		String tc = "";
		for(int i = 0; i < letters.length; i++) {
			if(i == 0) {
				tc += String.valueOf(letters[0]).toUpperCase();
			} else {
				tc += String.valueOf(letters[i]).toLowerCase();
			}
		}
		return tc;
	}

}
