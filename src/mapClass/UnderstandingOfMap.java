package mapClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UnderstandingOfMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Test1", 10);
		map.put("Test2", 10);
		map.put("Test3", 10);
		map.put("Test5", 10);
		
		map.get("Test1");

		Set< Entry<String, Integer> > entrySet = map.entrySet();

		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getKey().hashCode());
			System.out.println(entry.getKey().hashCode()%15);
			System.out.println("-----");
		}
	}

}
