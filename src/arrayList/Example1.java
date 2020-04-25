package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example1 {
	
	void addData() {
		List<String> li = new ArrayList<String>();
		li.add("test1");
		li.add("test2");
		li.add("test1");
		li.add("test2");
		li.add("test1");
		li.add("test2");
		li.add("test1");
		li.add("test2");
		li.add("test1");
		li.add("test2");
		li.add("test1");
		li.add("test2");
		
		
		List<String> li1 = new ArrayList<String>(30);
		li1.add("test1");
		li1.add("test2");
		li1.add("test1");
		li1.add("test2");
		li1.add("test1");
		
		LinkedList<String> li3 = new LinkedList<String>();
		li3.getFirst();
		
		List<String> li4 = new LinkedList<String>();
		//li4.getFirst();
	}
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		list.add("Test5");
	}

}
