package mapClass;

import java.util.HashMap;
import java.util.Map;

public class Example1 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("Test1", "A");
		map.put("Test2", "B");
		map.put("Test3", "C");
		map.put("Test4", "D");
		System.out.println(map);

		for (Map.Entry<String, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
