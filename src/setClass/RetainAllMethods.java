package setClass;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RetainAllMethods {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("Test1");
		set.add("Test2");
		set.add("Test3");
		System.out.println(set);

		Set<String> set1 = new HashSet<String>();
		set1.add("Test1");
		set1.add("Test3");

		System.out.println(set.retainAll(set1));

		System.out.println(set);
		System.out.println("--------------");
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("Test1");
		treeSet.add("Test2");
		treeSet.add("Test3");
		System.out.println(treeSet);

		Set<String> treeSet1 = new TreeSet<String>();
		treeSet1.add("Test1");
		treeSet1.add("Test3");

		System.out.println(treeSet.retainAll(treeSet1));
		System.out.println(treeSet);

		System.out.println("--------------");
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("Test1");
		linkedHashSet.add("Test2");
		linkedHashSet.add("Test3");
		System.out.println(linkedHashSet);

		Set<String> linkedHashSet1 = new TreeSet<String>();
		linkedHashSet1.add("Test1");
		linkedHashSet1.add("Test3");

		System.out.println(linkedHashSet.retainAll(linkedHashSet1));
		System.out.println(linkedHashSet);

	}

}
