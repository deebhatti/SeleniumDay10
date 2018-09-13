package collectionsFramework;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("London");
		cities.add("Paris");
		cities.add("Tokyo");
		cities.add("New York");
		cities.add("New Delhi");
		cities.add("Bangalore");
		
		for(String t : cities) {
			System.out.println(t);
		}
		
		//Adding a comment in line number 21
		
		System.out.println("Item present at 1st index = " + cities.get(1));
		System.out.println("Index of Paris = " + cities.indexOf("Paris"));
		System.out.println("Total items in the arraylist = " + cities.size());
		System.out.println("Is Sydney present in the ArrayList - " + cities.contains("Sydney"));
		
		
		
		
		
	}

}
