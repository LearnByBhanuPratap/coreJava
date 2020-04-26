package mapClass;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Example1 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("Test1", "A");
		map.put("Test2", "B");
		map.put("Test3", "C");
		map.put("Test4", "D");

		Set<Integer> set = new HashSet<Integer>();

		Set<Entry<String, String>> entry = map.entrySet();

		for (Entry<String, String> entry2 : entry) {
			System.out.println(entry2.getKey() + " " + entry2.getValue());
		}

		System.out.println(map);

		Map<String, String> linkedHashMap = new LinkedHashMap<>();

		linkedHashMap.put("Test1", "A");
		linkedHashMap.put("Test2", "B");
		linkedHashMap.put("Test3", "C");
		linkedHashMap.put("Test5", "D");
		linkedHashMap.put("Test4", "D");

		Set<Entry<String, String>> entry1 = linkedHashMap.entrySet();

		for (Entry<String, String> entry2 : entry1) {
			System.out.println(entry2.getKey() + " " + entry2.getValue());
		}

		System.out.println(linkedHashMap);

		Map<String, String> treeMap = new TreeMap<>();

		treeMap.put("Test1", "A");
		treeMap.put("Test2", "B");
		treeMap.put("Test3", "C");
		treeMap.put("Test5", "D");
		treeMap.put("Test4", "D");

		Set<Entry<String, String>> entry3 = treeMap.entrySet();

		for (Entry<String, String> entry2 : entry3) {
			System.out.println(entry2.getKey() + " " + entry2.getValue());
		}

		System.out.println(treeMap);

	}

}
