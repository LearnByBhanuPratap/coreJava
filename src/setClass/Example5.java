package setClass;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Example5 {

	public static void main(String args[]) {

		HashSet<String> set = new HashSet<String>();
		set.add("Test1");
		set.add("Test40");
		set.add("Test3");
		set.add("Test2");
		set.add("Test20");
		set.add("Test2");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("=========");
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
		linkedset.add("Test1");
		linkedset.add("Test40");
		linkedset.add("Test3");
		linkedset.add("Test2");
		linkedset.add("Test20");
		linkedset.add("Test2");
		Iterator<String> itr1 = linkedset.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}
