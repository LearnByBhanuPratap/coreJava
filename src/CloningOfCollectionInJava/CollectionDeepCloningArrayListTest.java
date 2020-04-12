package CloningOfCollectionInJava;

import java.util.ArrayList;

/**
 * This class will help us to know deep copy implementation of collection
 * classes
 * 
 * @author bsingh5
 *
 */
public class CollectionDeepCloningArrayListTest {

	public static void main(String args[]) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Amit", "Manager"));
		list.add(new Employee("Mohan", "Manager"));
		list.add(new Employee("Sohan", "Developer"));

		ArrayList<Employee> clonedList = new ArrayList<Employee>();

		for (Employee employee : list) {
			clonedList.add((Employee) employee.clone());
		}
		System.out.println("original---" + list);
		System.out.println("cloned---" + clonedList);
		
		System.out.println();
		System.out.println("[===========Modifying the clone data===========]");
		System.out.println();
		
		Employee data1 = clonedList.get(0);
		data1.setDesignation("1000");
		
		System.out.println();
		System.out.println("Original List hashCode ==" + list.hashCode());
		System.out.println("cloned List hashCode ==" + clonedList.hashCode());
		System.out.println("original---" + list);
		System.out.println("cloned---" + clonedList);

		ArrayList<Employee> list2 = new ArrayList<Employee>();
		for (Employee employee2 : list) {
			employee2.setDesignation("123");
			list2.add(employee2);
		}
		System.out.println();
		System.out.println("[===========Copied List data===========]");
		System.out.println("Original List hashCode ==" + list.hashCode());
		System.out.println("Copied List hashCode =="+list2.hashCode());
		System.out.println("original---" + list);
		System.out.println("Copied---" + list2);
	}

}
