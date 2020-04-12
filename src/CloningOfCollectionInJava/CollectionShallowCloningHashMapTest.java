package CloningOfCollectionInJava;

import java.util.HashMap;

public class CollectionShallowCloningHashMapTest {

	public static void main(String[] args) {

		HashMap<Integer, Employee2> map = new HashMap<Integer, Employee2>();
		map.put(1, new Employee2("Amit", "Manager"));
		map.put(2, new Employee2("Mohan", "Manager"));
		map.put(3, new Employee2("Sohan", "Developer"));

		HashMap<Integer, Employee2> clonedMap = (HashMap<Integer, Employee2>) map.clone();

		System.out.println("original---" + map);
		System.out.println("cloned---" + clonedMap);
		// Modifying the clone data
		Employee2 data3 = clonedMap.get(1);
		data3.setName("Data Modified By Cloned Object");
		
		System.out.println();
		System.out.println("[===========Modifying the clone data===========]");
		System.out.println();
		

		System.out.println("Original Map hashCode ==" + map.hashCode());
		System.out.println("cloned Map hashCode ==" + clonedMap.hashCode());
		System.out.println("original---" + map);
		System.out.println("cloned---" + clonedMap);

	}

}
