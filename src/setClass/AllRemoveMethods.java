package setClass;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class AllRemoveMethods {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Test1");
		set.add("Test2");
		set.add("Test3");
		set.add("Test4");
		set.add("Test5");
		System.out.println(set);
		set.remove("Test1");
		System.out.println(set);

		HashSet<String> set1 = new HashSet<String>();
		set1.add("Test4");
		set1.add("Test5");

		set.removeAll(set1);

		System.out.println(set);

		set.removeIf(s -> s.contains("Test3"));

		System.out.println("---------------");
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("Test1");
		linkedHashSet.add("Test2");
		linkedHashSet.add("Test3");
		linkedHashSet.add("Test4");
		linkedHashSet.add("Test5");
		System.out.println(linkedHashSet);
		linkedHashSet.remove("Test1");
		System.out.println(linkedHashSet);

		LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<String>();
		linkedHashSet1.add("Test4");
		linkedHashSet1.add("Test5");

		linkedHashSet.removeAll(linkedHashSet1);

		System.out.println(linkedHashSet);
		linkedHashSet1.removeIf(s -> s.contains("Test3"));
		System.out.println(linkedHashSet);

	}

}
