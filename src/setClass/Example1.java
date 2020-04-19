package setClass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();

		HashSet<String> set = new HashSet<String>();

		set.add("Test1");
		set.add("Test1");
		set.add("Test2");
		set.add("Test3");
		set.add("Test4");
		set.add("Test5");

		System.out.println(set);

		Iterator<String> i = set.iterator();

		while (i.hasNext()) {
			System.out.println(i.next().hashCode());
		}

		knowInsertion();
	}

	public static void knowInsertion() {
		
		HashSet<String> set = new HashSet<String>();

		set.add("Test1");
		for (String data : set) {
			System.out.println("add First Time Test1=" + data.hashCode() + " index=" + data.hashCode() % 15);
		}
		set.add("Test1");
		for (String data : set) {
			System.out.println("add Second Time Test1=" + data.hashCode() + " index=" + data.hashCode() % 15);
		}
		set.add("Test2");
		set.add("Test3");
		set.add("Test4");
		set.add("Test5");
		System.out.println(set);
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			String n = i.next();
			System.out.println("Data=" + n + " hashcode " + n.hashCode() + " index=" + (n.hashCode()) % 15);
		}
	}
}
