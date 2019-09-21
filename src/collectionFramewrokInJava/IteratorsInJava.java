package collectionFramewrokInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorsInJava {
	
	public static void main(String[] args) {
		List<Object> arrayList = new ArrayList<Object>();
		arrayList.add(4);
		arrayList.add(4);
		arrayList.add(true);
		arrayList.add(8.9);
		System.out.println(arrayList);
		
		Iterator<Object> itr = arrayList.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
			itr.remove();
		}
		
		System.out.println(arrayList);
		
		System.out.println("-----------------");
		List<Object> linkedList1 = new LinkedList<Object>();
		linkedList1.add(50);
		linkedList1.add(50);
		linkedList1.add(9.8);
		linkedList1.add(100);
		linkedList1.add(true);
		linkedList1.add(50);
		
		ListIterator<Object> itr1 = linkedList1.listIterator();
		
		
		
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
		
		while(itr1.hasPrevious()){
			System.out.println(itr1.previous());
		}
		
		

	}

}
