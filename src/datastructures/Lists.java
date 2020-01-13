package datastructures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		// 1. Create a collection
		ArrayList<String> cities = new ArrayList<String>();
		
		// 2.Add some elements
		cities.add("Cleaveland");
		cities.add("Istanbul");
		cities.add("Boston");
		cities.add("Miami");
		
		// 3.Ittirate the collection
		for (String city: cities) {
			System.out.println(city);
		}
		// 4. Get the size
		System.out.println(cities.size());
		// 5. Retrieve specific element
		System.out.println(cities.get(1));
		// 6. Remove element
		System.out.println(cities.remove(0));
		
		System.out.println(cities.size());
	}

}
