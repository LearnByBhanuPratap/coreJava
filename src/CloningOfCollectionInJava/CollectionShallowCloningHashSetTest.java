package CloningOfCollectionInJava;

import java.util.HashSet;

public class CollectionShallowCloningHashSetTest {
	
	public static void main(String[] args) {

		HashSet<Employee2> set = new HashSet<Employee2>();
		set.add(new Employee2("Amit", "Manager"));
		set.add(new Employee2("Mohan", "Manager"));
		set.add(new Employee2("Sohan", "Developer"));

		HashSet<Employee2> clonedSet = (HashSet<Employee2>) (set.clone());

		System.out.println("original---" + set);
		System.out.println("cloned---" + clonedSet);
		// Modifying the clone data
		Employee2 data2 = clonedSet.iterator().next();
		data2.setDesignation("9000");
		
		System.out.println();
		System.out.println("[===========Modifying the clone data===========]");
		System.out.println();
		System.out.println("Original Set hashCode ==" + set.hashCode());
		System.out.println("cloned Set hashCode ==" + clonedSet.hashCode());
		System.out.println("original---" + set);
		System.out.println("cloned---" + clonedSet);
	}

}
