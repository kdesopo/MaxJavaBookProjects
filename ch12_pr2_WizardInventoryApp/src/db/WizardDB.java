package db;

import java.util.ArrayList;
import ui.Console;

public class WizardDB {
	private ArrayList<String> items = new ArrayList<>();
	
	public WizardDB() {
		items.add("wooden staff");
		items.add("wizard hat");
		items.add("cloth shoes");
	}
	
	public void grabItem() {
		if(items.size() + 1 < 5) {
			String item = Console.getString("Name: ");
			items.add(item);
			System.out.println(item + " was added.\n");
		} else {
			System.out.println("You can't grab any more items. Drop something first.");
		}
	}
	
	public void editItem(int index, String newName) {
		items.set(index - 1, newName);
		System.out.println("Item number " + index + " was updated." );
	}
	
	public void dropItem(int index) {
		String item = items.get(index -1);
		items.remove(index - 1);
		System.out.println(item + " was dropped." );
	}	

	public ArrayList<String> getItems() {
		return items;
	}

	@Override
	public String toString() {
		String list = "";
		for(int n = 0; n < items.size(); n++) {
			list += (n+1) + ". " + items.get(n) + "\n";
		}
		return list;
	}
	
	
}
