package mapClass;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Example6 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("Test1", "A");
		map.put("Test2", "B");
		map.put("Test3", "C");
		map.put("Test4", "D");

		/**
		 * @return a set view of the mappings contained in this map.
		 */
		Set< Entry<String, String> > entry = map.entrySet();

		for (Entry<String, String> entry2 : entry) {
			System.out.println(entry2.getKey() + "==" + entry2.getValue());
		}

		/**
		 * Returns <tt>true</tt> if this map contains no key-value mappings.
		 *
		 * @return <tt>true</tt> if this map contains no key-value mappings
		 */
		System.out.println(map.isEmpty());

		/**
		 * Removes the mapping for the specified key from this map if present.
		 */
		map.remove("Test1");
		
		map.replace("Test2", "Test1000");
		
		System.out.println(map);
	}
}
