package mapClass;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Example10 {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(10, "Test1");
		linkedHashMap.put(11, "Test2");
		linkedHashMap.put(1000, "Test1");
		linkedHashMap.put(40, "Test4");
		linkedHashMap.put(20, "Test5");

		System.out.println(linkedHashMap);

		TreeMap<Integer, String> treeMap = new TreeMap<>();

		treeMap.put(10, "Test1");
		treeMap.put(11, "Test2");
		treeMap.put(1000, "Test1");
		treeMap.put(40, "Test4");
		treeMap.put(20, "Test5");

		System.out.println(treeMap);
	}
}
