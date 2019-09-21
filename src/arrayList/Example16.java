package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Example16 {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		list.add("Test1");

		System.out.println(list);

		Collections.replaceAll(list, "Test1","Test30");

		System.out.println(list);
	}
}
