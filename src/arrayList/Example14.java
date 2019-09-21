package arrayList;

import java.util.ArrayList;

public class Example14 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		list.add("Test5");

		System.out.println(list);

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Test1");
		list1.add("Test2");
		list1.add("Test3");

		list.removeAll(list1);

		System.out.println(list);
	}

}
