package setClass;

import java.util.HashSet;

public class Example3 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Test1");
		set.add("Test2");
		set.add("Test3");
		set.add("Test4");
		System.out.println("An initial list of elements: " + set);
		set.remove("Test1");
		System.out.println("After invoking remove(object) method: " + set);
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Test2");
		set1.add("Test3");
		set.addAll(set1);
		System.out.println("Updated List: " + set);
		set.removeAll(set1);
		System.out.println("After invoking removeAll() method: " + set);
		set.clear();
		System.out.println("After invoking clear() method: " + set);
	}
}
