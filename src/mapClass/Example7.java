package mapClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

public class Example7 {

	public static void main(String[] args) {
		
		Map<Object, Object> map = new HashMap<>();
		
		map.put(10, 1000);
		map.put("Test1", "AAA");
		map.put(10.90, 10.999);
		map.put('A', 'n');

		System.out.println(map);
		
		ArrayList<Object> arrayList = new ArrayList<Object>();
		arrayList.add(10);
		arrayList.add(true);
		arrayList.add('A');
		System.out.println(arrayList);
		
		LinkedList<Object> linkedList = new LinkedList<Object>();
		linkedList.add(10);
		linkedList.add(true);
		linkedList.add('A');
		
		System.out.println(linkedList);
		
		HashSet<Object> hashSet = new HashSet<Object>();
		hashSet.add(10);
		hashSet.add(true);
		hashSet.add('A');
		System.out.println(hashSet);
	

	}
}
