package CloningOfCollectionInJava;

import java.util.HashSet;

public class CollectionDeepCloningHashSetTest {

	public static void main(String[] args) {

		HashSet<Employee> set = new HashSet<Employee>();
		set.add(new Employee("Amit", "Manager"));
		set.add(new Employee("Mohan", "Manager"));
		set.add(new Employee("Sohan", "Developer"));

		HashSet<Employee> clonedSet = new HashSet<Employee>();

		for (Employee employee : set) {
			clonedSet.add((Employee) employee.clone());
		}

		System.out.println("original---" + set);
		System.out.println("cloned---" + clonedSet);
		System.out.println();
		System.out.println("[===========Modifying the clone data===========]");
		System.out.println();
		for (Employee employee : clonedSet) {
			employee.setDesignation("9000");
		}
		System.out.println("Original Set hashCode ==" + set.hashCode());
		System.out.println("cloned Set hashCode ==" + clonedSet.hashCode());
		System.out.println("original---" + set);
		System.out.println("cloned---" + clonedSet);

	}

}
