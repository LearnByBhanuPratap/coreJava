package mapClass;

import java.util.HashMap;
import java.util.Map;

public class Example5 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("Test1", "A");
		map.put("Test2", "B");
		map.put("Test3", "C");
		map.put("Test4", "D");
		
		System.out.println(map);

		/**
		 * Removes all of the mappings from this map. The map will be empty
		 * after this call returns.
		 */
		map.clear();
		System.out.println(map);

		/**
		 * Returns <tt>true</tt> if this map contains a mapping for the
		 * specified key.
		 */
		System.out.println(map.containsKey("Test1"));
		
	    /**
	     * value whose presence in this map is to be tested
	     * @return <tt>true</tt> if this map maps one or more keys to the
	     *         specified value
	     */
		System.out.println(map.containsValue("A"));
		
		map.put("Test1", "A");
		map.put("Test2", "B");
		map.put("Test3", "C");
		map.put("Test4", "D");
		
		System.out.println(map.containsKey("Test1"));
		System.out.println(map.containsValue("A"));
	}
}
