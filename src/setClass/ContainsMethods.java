package setClass;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ContainsMethods {
	
	public static void main(String[] args) {
		
		HashSet<Integer> original = new HashSet<Integer>();
		original.add(70);
		original.add(20);
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.add(70);
		linkedHashSet.add(20);
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(70);
		treeSet.add(20);
		
		System.out.println(original.contains(200));
		
		original.containsAll(linkedHashSet);
		
		System.out.println(original.size());
		System.out.println(treeSet.size());
	}

}
