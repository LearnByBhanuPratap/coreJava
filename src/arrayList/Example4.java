package arrayList;

import java.util.ArrayList;

public class Example4 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		list.add("Test5");
		System.out.println(list);
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Test11");
		list1.add("Test21");
		
		list.addAll(list1);
		
		System.out.println(list);
	}
}
