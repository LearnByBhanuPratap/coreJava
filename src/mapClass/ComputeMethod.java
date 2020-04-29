package mapClass;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * https://www.youtube.com/user/MrBhanupratap29/playlists
 * https://github.com/LearnByBhanuPratap
 *
 */
public class ComputeMethod {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		
		map.put("Name", "Bhanu");
		map.put("Address", "Bihar");

		System.out.println("Map: " + map);

		// The compute(Key, BiFunction) method of HashMap class allows you to 
		// update a value in HashMap. The compute() method tries to compute a 
		// mapping for the specified key and its current mapped value 
		//(or null if there is no current mapping is found). 
		
		
		map.compute("Name", (key, val) -> val.concat(" Singh"));
		map.compute("Address", (key, val) -> val.concat(" Muzaffarupur"));

		System.out.println("New Map: " + map);

		Map<String, Integer> map1 = new HashMap<>();
		map1.put("Test1", 12);
		map1.put("Test2", 15);
		map1.put("Test3", null);
		
		System.out.println("------------------------");
		System.out.println("Map: " + map1);
	
				 
		map1.compute("Test1", (key, val) -> (val == null) ? 10 : val + 100);
		map1.compute("Test2", (key, val) -> (val == null) ? 100 : val + 500);
		map1.compute("Test3", (key, val) -> (val == null) ? 0000 : val + 400);
		
		System.out.println(map1.get("Test4"));
		map1.compute("Test4", (key, val) -> (val == null) ? 90 : val + 400);
		
		System.out.println("New Map: " + map1);
		
		System.out.println("------------------------");
		
		map = new HashMap<>();
		map.put("Name", "Bhanu");
		map.put("Address", "Bihar");
		
		System.out.println("computeIfAbsent Map: " + map);

		// The computeIfAbsent(Key, Function) method of HashMap class is used to compute value 
		// for a given key using the given mapping function, if key is not already associated 
		// with a value (or is mapped to null) and enter that computed value in Hashmap else 
		// null.
		map.computeIfAbsent("Test", key -> "Test Singh");
		map.computeIfAbsent("Address1", key -> "Bihar"+ "Muzaffarupur");
		map.computeIfAbsent("Name", key -> "Bhanu Singh");

		System.out.println("computeIfAbsent New Map: " + map);

		System.out.println("------------------------");
		map1 = new HashMap<>();
		map1.put("Test1", 12);
		map1.put("Test2", 15);

		System.out.println("computeIfPresent Map: " + map1);
		
		// The computeIfPresent(Key, BiFunction) method of HashMap class which allows
		// you to compute value of a mapping for specified key if key is already associated
		// with a value (or is mapped to null).
		map1.computeIfPresent("Test1", (key, val) -> (val == null) ? 100 : val + 100);
		map1.computeIfPresent("Test2", (key, val) -> (val == null) ? 900 : val * 500);
		System.out.println(map1.get("Test3"));
		map1.computeIfPresent("Test3", (key, val) -> (val == null) ? 800 : val * 400);
		
		System.out.println("computeIfPresent New Map: " + map1);
		
		
	}
}