package collectionFramewrokInJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInJava2 {
	
	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(4);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(9);
		System.out.println(arrayList);
		
		List<Integer> arrayList1 = new ArrayList<Integer>();
		arrayList1.add(4);
		arrayList1.add(40);
		arrayList1.add(50);
		arrayList1.add(9);

		//System.out.println(arrayList1);
		//arrayList.addAll(arrayList1);
		//arrayList.add(2, 600);
		
		//arrayList.removeAll(arrayList1);
		arrayList.remove(3);
		
		
		System.out.println(arrayList);
		
	}

}
