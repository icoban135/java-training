package datastructures;

import java.util.HashSet;

public class Sets {

	public static void main(String[] args) {
		// 1.DEfine the collection
		HashSet<String> animals = new HashSet<String>();
		
		// 2.Adding Elements
		
		animals.add("dog");
		animals.add("cat");
		animals.add("horse");
		animals.add("snake");
		animals.add("turtle");
		animals.add("elepthant");
		
		System.out.println(animals);
	}

}
