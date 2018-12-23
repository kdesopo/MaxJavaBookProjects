package ui;

public class HTMLConverterApp {

	public static void main(String[] args) {
		String html = "<h1>Grocery List</h1>\n" + 
				  "<ul>\n" +
				  "	<li>Eggs</li>\n" +
				  "	<li>Milk</li>\n" +
				  "	<li>Butter</li>\n" +
				  "</ul>";
		
		System.out.println("HTML Converter");
		System.out.println("\nINPUT");
		System.out.println(html);
		System.out.println("\nOUTPUT");
		String text = html.replaceAll("<li>", "* ");
		text = text.replaceAll("(</?h1>\\n?)|(</?ul>)|(</li>)", "");
		System.out.println(text);

	}

}
