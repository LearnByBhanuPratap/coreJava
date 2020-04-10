package arrayList;

import java.util.ArrayList;
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
