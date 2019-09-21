package collectionFramewrokInJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInJava {
	
	public static void main(String[] args) {
		
		List arrayList = new ArrayList<>();
		
		arrayList.add(2);
		arrayList.add(9.8);
		arrayList.add(true);
		arrayList.add("Test");
		arrayList.add(2);
		
		System.out.println(arrayList);
		
		List<Integer> arrayList1 = new ArrayList<Integer>();
		arrayList1.add(4);
		arrayList1.add(4);
		arrayList1.add(5);
		arrayList1.add(9);

		System.out.println(arrayList1);
		
	}

}
