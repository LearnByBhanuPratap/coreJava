package linkedList;

import java.util.LinkedList;

public class Example4 {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");
		System.out.println(linkedList);
		
		linkedList.removeFirst();
		
		System.out.println(linkedList);

		linkedList.removeLast();
		
		System.out.println(linkedList);

		linkedList.remove();
		
		System.out.println(linkedList);
		System.out.println("------");
		LinkedList<String> linkedList1 = new LinkedList<>();

		linkedList1.add("AA");

		linkedList1.add("BB");
		linkedList1.add("CC");
		linkedList1.add(2, "AAA");
		linkedList1.add("DD");
		linkedList1.add("CCC");
		linkedList1.add("DD");
		linkedList1.add("DD");
		System.out.println(linkedList1);

		System.out.println(linkedList1);
		
		linkedList1.remove(2);
		
		System.out.println(linkedList1);
		
		System.out.println(linkedList1.remove("BB"));
		
		System.out.println(linkedList1);

		LinkedList<String> linkedList3 = new LinkedList<>();

		linkedList3.add("AA");
		linkedList3.add("DD");

		linkedList1.removeAll(linkedList3);
		
		System.out.println(linkedList1);

		linkedList1.removeFirstOccurrence("DD");
		
		System.out.println(linkedList1);

		linkedList1.removeLastOccurrence("DD");
		
		System.out.println(linkedList1);

		linkedList1.removeIf(n -> n.contains("CCC"));
		
		System.out.println(linkedList1);

	}
}
