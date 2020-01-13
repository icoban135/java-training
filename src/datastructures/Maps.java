package datastructures;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// Implement map Interfaces
		// TreeMap puts map in order organized by key
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		mapUtil(hMap);
	}
	
	public static void mapUtil(Map<Integer, String> map) {
		//1.Add Key-Value pairs
		map.put(101, "Steve");
		map.put(589, "Roger");
		map.put(89, "Jennifer");
		map.put(899, "Ibo");
		map.put(7889, "Adam");
		
		// 2. Expose / Access elements
		
		System.out.println("See all the keys: " + map.keySet());
		System.out.println("See all teh Key-Value pairs: " + map);
		
		// 3. Iterate through map of key-value pairs
		for (int key : map.keySet()) {
			System.out.println("KEY: " + key + " VALUE: " + map.get(key));
		}
		
	}

}
