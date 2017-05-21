package collectionFramewrokInJava;

import java.util.LinkedList;
import java.util.List;

public class LinkedListInJava2 {

	public static void main(String[] args) {
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("50");
		linkedList.add("50");
		linkedList.add("Test");
		linkedList.add("100");
		linkedList.add("true");
		linkedList.add("50");
		
		List<String> linkedList1 = new LinkedList<String>();
		linkedList1.add("500");
		linkedList1.add("50");

		System.out.println(linkedList);
		
		//linkedList.addAll(linkedList1);
		//linkedList.add(3, "9000");
		//linkedList.retainAll(linkedList1);
		//linkedList.removeAll(linkedList1);
		//System.out.println(linkedList.get(2));
		//System.out.println(linkedList);
		
		//System.out.println(linkedList.contains("Test"));
		
		//System.out.println(linkedList.contains("Test123"));
		
		//System.out.println(linkedList.containsAll(linkedList1));
		
		System.out.println(linkedList.size());
	}

}
