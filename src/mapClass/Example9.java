package mapClass;

import java.util.HashMap;
import java.util.Map;

public class Example9 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(null, "Test1");
		map.put(null, "Test1");
		map.put(null, "Test1");
		map.put(null, "Test1");
		map.put(1, null);
		map.put(2, null);
		map.put(3, null);
		map.put(4, null);

		System.out.println(map);
	}
}
