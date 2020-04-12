package CloningOfCollectionInJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class CollectionDeepCloningMapTest {

	public static void main(String[] args) {
		
		HashMap<Integer, Employee> map = new HashMap<Integer, Employee>();
		map.put(1, new Employee("Amit", "Manager"));
		map.put(2, new Employee("Mohan", "Manager"));
		map.put(3, new Employee("Sohan", "Developer"));

		HashMap<Integer, Employee> clonedMap = new HashMap<Integer, Employee>();

		Set<Entry<Integer, Employee>> entrySet = map.entrySet();
		Iterator<Entry<Integer, Employee>> itr = entrySet.iterator();
		while (itr.hasNext()) {
			Entry<Integer, Employee> entry = itr.next();
			clonedMap.put(entry.getKey(), (Employee) entry.getValue().clone());
		}

		System.out.println("original---" + map);
		System.out.println("cloned---" + clonedMap);
		System.out.println();
		System.out.println("[===========Modifying the clone data===========]");
		System.out.println();
		
		Employee data3 = clonedMap.get(1);
		data3.setName("Data Modified By Cloned Object");
		
		System.out.println("Original Map hashCode ==" + map.hashCode());
		System.out.println("cloned Map hashCode ==" + clonedMap.hashCode());
		System.out.println("original---" + map);
		System.out.println("cloned---" + clonedMap);
	}

}
