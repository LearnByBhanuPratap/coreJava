package mapClass;

import java.util.HashMap;

public class Example3 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		map.put("Test1", "A");
		map.put("Test2", "B");
		map.put("Test3", "C");
		map.put("Test4", "D");
		System.out.println(map);
		
		System.out.println(map.get("Test1"));
	}
}
