package mapClass;

import java.util.HashMap;
import java.util.Map;

public class Example7 {

	public static void main(String[] args) {
		
		Map<Object, Object> map = new HashMap<>();
		map.put(10, 1000);
		map.put("Test1", "AAA");
		map.put(10.90, 10.999);
		map.put('A', 'n');

		System.out.println(map);

	}
}
