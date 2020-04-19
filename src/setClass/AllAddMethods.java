package setClass;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class AllAddMethods {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<Integer>();
		set.add(22);
		set.add(50);
		set.add(10);
		set.add(10);
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		set.add(22);
		set.add(500);
		set.add(60);
		set.add(10);
		
		set.addAll(set1);
		
		System.out.println(set);
		
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.add(22);
		linkedHashSet.add(50);
		linkedHashSet.add(10);
		linkedHashSet.add(10);
		
		LinkedHashSet<Integer> linkedHashSet1 = new LinkedHashSet<Integer>();
		linkedHashSet.add(22);
		linkedHashSet.add(500);
		linkedHashSet.add(60);
		linkedHashSet.add(10);
		linkedHashSet.addAll(linkedHashSet1);
		
		System.out.println(linkedHashSet);

		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(22);
		treeSet.add(50);
		treeSet.add(10);
		treeSet.add(10);
		
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
		treeSet.add(22);
		treeSet.add(500);
		treeSet.add(60);
		treeSet.add(1);
		
		treeSet.addAll(treeSet1);
		
		System.out.println(treeSet);
	}

}
