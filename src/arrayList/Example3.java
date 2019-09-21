package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Example3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		list.add("Test5");
		System.out.println(list);
		System.out.println("");
		System.out.println("Iterate ArrayList Through For Loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Iterate ArrayList Through For Each Loop");
		for (String li : list) {
			System.out.println(li);
		}
		
		System.out.println("Iterate ArrayList Through Iterator");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
}
