package mapClass;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Example4 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();

		map.put("Test1", "A");
		map.put("Test2", "B");
		map.put("Test3", "C");
		map.put("Test4", "D");

		System.out.println(map);
		System.out.println("=========");

		System.out.println(map.remove("Test1"));

		System.out.println(map);
		System.out.println("=========");

		HashMap<String, String> map1 = new HashMap<>();
		map1.put("Test5", "A1");
		map1.put("Test6", "B1");
		map1.put("Test7", "C1");
		map1.put("Test8", "D1");

		map.putAll(map1);

		System.out.println(map);

		System.out.println(map.putIfAbsent("Test8", "putIfAbsent"));
		System.out.println(map.putIfAbsent("Test80", "putIfAbsent"));

		System.out.println(map);

		System.out.println("---------------------");

		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("Test1", "A");
		linkedHashMap.put("Test2", "B");
		linkedHashMap.put("Test3", "C");
		linkedHashMap.put("Test4", "D");
		linkedHashMap.put("Test5", "A1");
		linkedHashMap.put("Test6", "B1");
		linkedHashMap.put("Test7", "C1");

		for (Entry<String, String> linkedMap : linkedHashMap.entrySet()) {
			System.out.println(linkedMap.getKey().hashCode()+" "+linkedMap.getKey());
		}

		System.out.println(linkedHashMap);
		System.out.println("=========");

		System.out.println(linkedHashMap.remove("Test1"));

		System.out.println(linkedHashMap);
		System.out.println("=========");

		LinkedHashMap<String, String> linkedHashMap1 = new LinkedHashMap<>();
		linkedHashMap1.put("Test5", "A11");
		linkedHashMap1.put("Test6", "B11");
		linkedHashMap1.put("Test7", "C11");
		linkedHashMap1.put("Test8", "D11");
		
		for (Entry<String, String> linkedMap : linkedHashMap1.entrySet()) {
			System.out.println(linkedMap.getKey().hashCode()+" "+linkedMap.getKey());
		}

		linkedHashMap.putAll(linkedHashMap1);
		
		System.out.println(linkedHashMap);
	}
}
