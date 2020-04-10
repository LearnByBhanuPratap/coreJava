package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(Integer.valueOf(90));
		li.add(190);
		li.add(Integer.valueOf(100));
		li.add(900);
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		list.add("Test5");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		list.remove(1);
		System.out.println("After data removal from list");
		System.out.println(list);
	}

}
