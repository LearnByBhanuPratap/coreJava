package mapClass;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapObjects {

	public static void main(String[] args) {
		ConcurrentHashMap<String , String>  mymap = new ConcurrentHashMap<String ,String>();
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(10, 20);
		map.put(11, 30);
		map.put(12, 40);
		map.put(8, 50);
		System.out.println(map);

		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>(400);

		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>(400, 0.5f);

		Map<Integer, Integer> map3 = new HashMap<Integer, Integer>(map);

		Map<Integer, Integer> map4 = new LinkedHashMap<Integer, Integer>();
		map4.put(10, 20);
		map4.put(11, 30);
		map4.put(12, 40);
		map4.put(8, 50);
		System.out.println(map4);

		Map<Integer, Integer> map5 = new LinkedHashMap<Integer, Integer>(400);

		Map<Integer, Integer> map6 = new LinkedHashMap<Integer, Integer>(400, 0.5f);

		Map<Integer, Integer> map7 = new LinkedHashMap<Integer, Integer>(map);
		
		Map<Integer, Integer> map8 = new TreeMap<Integer, Integer>();
		map8.put(10, 20);
		map8.put(11, 30);
		map8.put(12, 40);
		map8.put(8, 50);
		System.out.println(map8);
		
		Map<Integer, Integer> map9 = new TreeMap<Integer, Integer>(map8);
	}

}
