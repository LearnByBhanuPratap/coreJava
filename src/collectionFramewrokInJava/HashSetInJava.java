package collectionFramewrokInJava;

import java.util.HashSet;
import java.util.Set;

public class HashSetInJava {
	
	public static void main(String[] args) {
		Set hashSet = new HashSet<>();
		hashSet.add(2);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(2);
		hashSet.add(9.08);
		
		System.out.println(hashSet);
		
		Set<Object> hashSet1 = new HashSet<Object>();
		hashSet1.add(2);
		hashSet1.add(2);
		hashSet1.add(3);
		hashSet1.add(2);
		hashSet1.add(9.08);
		System.out.println(hashSet1);
		HashSet<Integer> hashSet2 = new HashSet<Integer>();
		hashSet2.add(2);
		hashSet2.add(2);
		hashSet2.add(3);
		hashSet2.add(2);

		
		System.out.println(hashSet2);
		
		
	}

}
