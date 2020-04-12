package setClass;

import java.util.HashSet;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();

		set.add("Test1");
		set.add("Test2");
		set.add("Test3");
		set.add("Test4");
		set.add("Test5");
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next().hashCode());
		}
	}
}
