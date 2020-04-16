package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test1234 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(3);
		list.add(4);
		
		List<Integer> list1 = new LinkedList<Integer>(list);
		
		System.out.println(list1);
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(4);
		list2.add(4);
		list2.add(4);
		list2.add(3);
		list2.add(4);
		
		list2.addFirst(7);
		list2.addFirst(8);
		list2.addFirst(9);
		list2.add(40);
		list2.addLast(90);
		list2.addLast(70);
		list2.addLast(9000);
		
		System.out.println(list2);
		
		List<Integer> list3 = new ArrayList<Integer>(list2);
		System.out.println(list3);
	}

}
