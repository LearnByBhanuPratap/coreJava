package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Example17 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(9);
		list.add(20);
		list.add(11);
		list.add(15);
		
		System.out.println("before sorting="+list);
		
		Collections.sort(list);
		
		System.out.println("After sorting="+list);
	}

}
