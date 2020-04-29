package mapClass;

import java.util.HashMap;
import java.util.TreeMap;

public class Example16 {

	public static void main(String[] args) {

		HashMap<Integer, String> hasMap = new HashMap<Integer, String>();
		
		hasMap.put(null, null);
		hasMap.put(null, null);
		hasMap.put(null, null);
		hasMap.put(20, null);
		hasMap.put(30, null);
		
		System.out.println(hasMap);

		System.out.println("---------");
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		treeMap.put(null, null);
		treeMap.put(null, null);
		treeMap.put(null, null);
		treeMap.put(20, null);
		treeMap.put(30, null);
		
		System.out.println(treeMap);

	}
}
