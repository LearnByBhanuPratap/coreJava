package collectionFramewrokInJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInJava3 {
	
	public static void main(String[] args) {
	
		List<Object> arrayList = new ArrayList<Object>();
		arrayList.add(4);
		arrayList.add(4);
		arrayList.add(true);
		arrayList.add(8.9);
		System.out.println(arrayList);
		
		List<Integer> arrayList1 = new ArrayList<Integer>();
		arrayList1.add(3);
		arrayList1.add(4);
		arrayList1.add(6);
		arrayList1.add(8);
		
		//arrayList.retainAll(arrayList1);
		
		//System.out.println(arrayList.size());
		
		//System.out.println(arrayList.get(3));
		
		//System.out.println(arrayList.contains(4));
		
		//System.out.println(arrayList.contains(400));
		
		System.out.println(arrayList.containsAll(arrayList1));

		//System.out.println(arrayList);
		
	}

}
