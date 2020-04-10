package arrayList;

import java.util.ArrayList;

public class Example5 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		System.out.println(list.isEmpty());
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		list.add("Test5");
		list.add("Test1");
		list.add("Test1");
		list.add("Test1");
		System.out.println(list);
		
		System.out.println("list.lastIndexOf(\"Test1\")="+list.lastIndexOf("Test1"));
		System.out.println(list.lastIndexOf("Test1000"));
		System.out.println(list.isEmpty());
		
		//list.clear();
		
		System.out.println(list);
		
		ArrayList<String> list1 = (ArrayList<String>) list.clone();
		list1.remove(3);
		System.out.println(list1);
		System.out.println(list);
		
		System.out.println(list.contains("123"));
		System.out.println(list.contains("Test5"));
	}
}
