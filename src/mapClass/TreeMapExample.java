package mapClass;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hasMap = new HashMap<Integer, String>();


		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		keepDistance();
        
		// by default tree map stores object in ascending order
		treeMap.put(10, "Test1");
		treeMap.put(20, "Test2");
		treeMap.put(30, "Test3");
		treeMap.put(40, "Test4");
		treeMap.put(50, "Test5");
		treeMap.put(60, "Test6");
		System.out.println("print1 " + treeMap);

		TreeMap<Integer, String> cloned = (TreeMap<Integer, String>) treeMap.clone();
		System.out.println("print2 " + cloned);

		NavigableSet<Integer> descendingKeySet = treeMap.descendingKeySet();
		System.out.println("print3 " + descendingKeySet);

		NavigableMap<Integer, String> descendingMap = treeMap.descendingMap();
		System.out.println("print4 " + descendingMap);

		Entry<Integer, String> firstEntry = treeMap.firstEntry();
		System.out.println("print5 " + firstEntry);

		keepDistance();

		Entry<Integer, String> lastEntry = treeMap.lastEntry();
		System.out.println("print6 " + lastEntry);

		Entry<Integer, String> floorEntry = treeMap.floorEntry(30);
		System.out.println("print7 " + floorEntry);

		floorEntry = treeMap.floorEntry(300);
		System.out.println("print8 " + floorEntry);

		Integer floorKey = treeMap.floorKey(30);
		System.out.println("print9 " + floorKey);

		System.out.println("print10 " + treeMap.getOrDefault(30, "defaultValue"));

		System.out.println("print11 " + treeMap.getOrDefault(300, "defaultValue"));

		System.out.println("original Map " + treeMap);

		keepDistance();

		SortedMap<Integer, String> headMap = treeMap.headMap(40);
		System.out.println("print12 " + headMap);

		headMap = treeMap.headMap(40, true);
		System.out.println("print13 " + headMap);

		SortedMap<Integer, String> tailMap = treeMap.tailMap(40);
		System.out.println("print14 " + tailMap);

		tailMap = treeMap.tailMap(40, false);
		System.out.println("print15 " + tailMap);

		System.out.println("original Map " + treeMap);

		keepDistance();

		System.out.println("print16 " + treeMap);
		
		Entry<Integer, String> pollFirstEntry = treeMap.pollFirstEntry();
		System.out.println("print17 " + pollFirstEntry);
		System.out.println("print18 " + treeMap);

		Entry<Integer, String> pollLastEntry = treeMap.pollLastEntry();
		System.out.println("print19 " + pollLastEntry);
		System.out.println("print20 " + treeMap);

		Set<Integer> keySet = treeMap.keySet();
		Set<Integer> keySet1 = hasMap.keySet();
		System.out.println("print21 " + keySet);

		SortedMap<Integer, String> subMap = treeMap.subMap(20, 50);
		System.out.println("print22 " + subMap);

		System.out.println("original Map " + treeMap);

		keepDistance();

		subMap = treeMap.subMap(20, true, 50, false);
		System.out.println("print23 " + subMap);

		subMap = treeMap.subMap(20, false, 50, false);
		System.out.println("print24 " + subMap);

		subMap = treeMap.subMap(20, true, 50, true);
		System.out.println("print25 " + subMap);

		Collection<String> values = treeMap.values();
		Collection<String> values1 = hasMap.values();
		System.out.println("print26 " + values);
	}

	private static void keepDistance() {
		System.out.println();
		System.out.println("******************************");
		System.out.println();
	}

}
