package setClass;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Example6 {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(40);
		set.add(900);
		set.add(50);
		set.add(6);
		set.add(70);
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("============");
		TreeSet<String> set1 = new TreeSet<String>();
		set1.add("ABC");
		set1.add("BCD");
		set1.add("EFG");
		set1.add("XXX");
		set1.add("CAB");
		Iterator<String> itr1 = set1.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("============");
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		set2.add("ABC");
		set2.add("BCD");
		set2.add("EFG");
		set2.add("XXX");
		set2.add("CAB");
		Iterator<String> itr2 = set2.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
