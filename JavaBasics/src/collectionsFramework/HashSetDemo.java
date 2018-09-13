package collectionsFramework;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		HashSet<String> cities2 = new HashSet<>();
		ArrayList<String> cities = new ArrayList<>();
		
		cities2.add("London");
		cities2.add("Paris");
		cities2.add("Tokyo");
		cities2.add("New York");
		cities2.add("New Delhi");
		cities2.add("Bangalore");
		cities2.add("London");
		
		cities.addAll(cities2);
		
		for(String t : cities) {
			System.out.println(t);
		}
		
		System.out.println();
		
		System.out.println("Item present at 1st index = " + cities.get(1));
		System.out.println("Index of Paris = " + cities.indexOf("Paris"));
		System.out.println("Total items in the HashSet = " + cities2.size());
		System.out.println("Is Sydney present in the HashSet - " + cities2.contains("Sydney"));
	
	
	}

}
