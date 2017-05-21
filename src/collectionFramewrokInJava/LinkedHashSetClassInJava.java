package collectionFramewrokInJava;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClassInJava {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hashSet1 = new HashSet<Integer>();
		hashSet1.add(211);
		hashSet1.add(200);
		hashSet1.add(30);
		hashSet1.add(20000);
		hashSet1.add(20000);
		hashSet1.add(20000);
		hashSet1.add(20000);
		System.out.println(hashSet1);
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.add(211);
		linkedHashSet.add(200);
		linkedHashSet.add(30);
		linkedHashSet.add(20000);
		linkedHashSet.add(20000);
		linkedHashSet.add(20000);
		System.out.println(linkedHashSet);
		
		Set<Integer> linkedHashSet1 = new LinkedHashSet<Integer>();
		linkedHashSet1.add(211);
		linkedHashSet1.add(200);
		linkedHashSet1.add(30);
		linkedHashSet1.add(20000);
		linkedHashSet1.add(20000);
		linkedHashSet1.add(20000);
		
		System.out.println(linkedHashSet1);
	}

}
