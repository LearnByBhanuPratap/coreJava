package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveMethods {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		
		//System.out.println(list);
		Integer removedData = list.remove(2);
		//System.out.println(list);
		
		boolean removedData1 = list.remove(Integer.valueOf(20));
		//System.out.println(list);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(40);
		list1.add(10);
		list1.add(100);
		
		list.removeAll(list1);
		
		//System.out.println(list);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(21);
		list2.add(30);
		list2.add(40);
		list2.add(10);
		
		//list2.removeIf(n -> (n>20));
		
		list2.removeIf(p -> (p%3==0));
		
		//System.out.println(list2);
		
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(10);
		list3.add(21);
		list3.add(30);
		list3.add(40);
		list3.add(10);
		list3.add(10);
		list3.add(10);
		list3.add(10);
		
		Object[] list450 = list3.toArray();
		
		System.out.println(list450[0]);
		System.out.println(list450[1]);
		System.out.println(list450[2]);
		System.out.println(list450[3]);
		
		System.out.println(Arrays.toString(list450));
		
		List<Integer> list45 = list3.subList(2, 5);
		System.out.println("list45="+list45);
		
		
		
		System.out.println(list3.size());
		
		System.out.println(list3);
		list3.set(2, 2000);
		System.out.println(list3);
		list3.add(3, 5000);
		System.out.println(list3);
		
		//System.out.println(list3);
		List<Integer> list4 = new ArrayList<Integer>();
		list4.add(100);
		list4.add(400);
		
		//System.out.println(list3.retainAll(list4));
		//System.out.println(list3);
		

		
	}

}
