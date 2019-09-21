package mapClass;

import java.util.HashMap;
import java.util.Map;

public class Example8 {

	public static void main(String[] args) {

		Map<Integer, School> map = new HashMap<>();

		School s1 = new School("Test1", "20", "A");
		School s2 = new School("Test2", "30", "B");
		School s3 = new School("Test3", "40", "C");
		School s4 = new School("Test4", "50", "D");

		map.put(1, s1);
		map.put(2, s2);
		map.put(3, s3);

		// What happens when you store duplicate key
		map.put(3, s4);

		System.out.println(map);

	}
}
