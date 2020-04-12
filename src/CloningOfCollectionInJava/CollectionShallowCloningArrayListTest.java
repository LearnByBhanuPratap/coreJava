package CloningOfCollectionInJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * This class will help us to know deep copy implementation of collection
 * classes
 * 
 * @author bsingh5
 *
 */
public class CollectionShallowCloningArrayListTest {

	public static void main(String args[]) {

		ArrayList<Employee2> list = new ArrayList<Employee2>();
		list.add(new Employee2("Amit", "Manager"));
		list.add(new Employee2("Mohan", "Manager"));
		list.add(new Employee2("Sohan", "Developer"));

		List<Employee2> clonedList = (List<Employee2>) list.clone();
	
		System.out.println("original---" + list);
		System.out.println("clonedList---" + clonedList);
		
		System.out.println();
		System.out.println("[===========Modifying the clone data===========]");
		System.out.println();
		
		Employee2 data1 = clonedList.get(0);
		data1.setDesignation("1000");
		

		System.out.println("Original List hashCode ==" + list.hashCode());
		System.out.println("cloned List hashCode ==" + clonedList.hashCode());
		System.out.println("original---" + list);
		System.out.println("clonedList---" + clonedList);
		
		
		ArrayList<Employee2> list2 = new ArrayList<Employee2>();
		for (Employee2 employee2 : list) {
			employee2.setDesignation("123");
			list2.add(employee2);
		}
		System.out.println("[===========Copied List data===========]");
		System.out.println("Copied List hashCode =="+ list2.hashCode());
		System.out.println(list);
		System.out.println(list2);
	}

}
