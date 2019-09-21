package mapClass;

import java.util.HashMap;

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
	}
}
