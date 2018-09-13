package collectionsFramework;

import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		TreeSet<String> cities = new TreeSet<>();
		
		cities.add("London");
		cities.add("Paris");
		cities.add("Tokyo");
		cities.add("New York");
		cities.add("New Delhi");
		cities.add("Bangalore");
		cities.add("London");
		
		for(String t : cities) {
			System.out.println(t);
		}
		
		System.out.println();
		
//		System.out.println("Item present at 1st index = " + cities.get(1));
//		System.out.println("Index of Paris = " + cities.indexOf("Paris"));
		System.out.println("Total items in the arraylist = " + cities.size());
		System.out.println("Is Sydney present in the ArrayList - " + cities.contains("Sydney"));
		
		//Today is Wednesday
		
	}

}
