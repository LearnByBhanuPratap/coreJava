package concurrentHashMap;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;

public class ForEachMethods_2 {

	public static void main(String[] args) {

		ConcurrentHashMap<Integer, String> conHashMap = new ConcurrentHashMap<Integer, String>();

		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

		for (int i = 0; i < 50; i++) {
			conHashMap.put(i, "A");
		}

		long start = System.currentTimeMillis();

		conHashMap.forEach((k, v) -> System.out.print(v.isEmpty() ? " " : v.concat(" concat") + " "));

		long end = System.currentTimeMillis();

		System.out.println(end - start);

		System.out.println("----------------------------");
		
		start = System.currentTimeMillis();

		conHashMap.forEach(25, (k, v) -> System.out.print(v.concat("concat"+",")));

		end = System.currentTimeMillis();

		System.out.println(end - start);
		
		System.out.println("----------------------------");

		// System.out.println(conHashMap);

		
		conHashMap.forEach(4, (k, v) -> v, (v) -> System.out.print(v.toLowerCase() + ", "));
		System.out.println("----------------------------");

		//System.out.println(conHashMap);

		// forEach() without transformer function
		conHashMap.forEach(4, (k, v) -> System.out.print(String.valueOf(k) + " " + v.toLowerCase() + ", "));
		System.out.println("----------------------------");

		// forEach() without transformer function
		conHashMap.forEach(4, (k, v) -> hashmap.put(k, v.toUpperCase()));
		System.out.println(" New HashMap:");
		System.out.println(hashmap);

		// forEach() with transformer function
		System.out.print("Values are ");
		conHashMap.forEach(4, (k, v) -> v, (v) -> System.out.print(v + ", "));
		System.out.println("----------------------------");

	}
}
