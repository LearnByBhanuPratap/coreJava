package arrayList;

import java.util.ArrayList;

public class Example23 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(2);

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		ArrayList<String> list1 = new ArrayList<>(2);

		list1.add("E");
		list1.add("F");
		list1.add("G");
		list1.add("H");

		list.addAll(list1);

		System.out.println(list);
		
		list.clear();
		System.out.println(list);
	}
}
