package collectionsFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList<>();
		
		cities.add("London");
		cities.add("Paris");
		cities.add("Tokyo");
		cities.add("New York");
		cities.add("New Delhi");
		cities.add("Bangalore");
		cities.add("London");
		
		
//		for(String t : cities) {
//			System.out.println(t);
//		}
		
		Iterator<String> itr = cities.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		System.out.println("Item present at 1st index = " + cities.get(1));
		System.out.println("Index of Paris = " + cities.indexOf("Paris"));
		System.out.println("Total items in the Linkedlist = " + cities.size());
		System.out.println("Is Sydney present in the Linkedlist - " + cities.contains("Sydney"));
		
		
	}

}
