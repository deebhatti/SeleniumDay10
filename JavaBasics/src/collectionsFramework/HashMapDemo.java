package collectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		HashMap<String,Integer> td = new HashMap<>();
		
		td.put("Tim", 12345);
		td.put("Sam", 65432);
		td.put("Paul", 98765);
		td.put("John", 74563);
		
		for(Map.Entry m: td.entrySet()) {
			System.out.println(m.getKey() + " - " + m.getValue());
		}
		
		
	}

}
