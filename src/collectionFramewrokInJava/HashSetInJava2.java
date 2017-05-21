package collectionFramewrokInJava;

import java.util.HashSet;
import java.util.Set;

public class HashSetInJava2 {
	
	public static void main(String[] args) {

		HashSet<Integer> hashSet2 = new HashSet<Integer>();
		hashSet2.add(21);
		hashSet2.add(20);
		hashSet2.add(3);
		hashSet2.add(2);
		
		HashSet<Integer> hashSet1 = new HashSet<Integer>();
		hashSet1.add(211);
		hashSet1.add(200);
		hashSet1.add(30);
		hashSet1.add(20);

		
		System.out.println(hashSet2);
		
		//hashSet2.addAll(hashSet1);
		//hashSet2.removeAll(hashSet1);
		//hashSet2.retainAll(hashSet1);
		//System.out.println(hashSet2.contains(20));
		
		//System.out.println(hashSet2.containsAll(hashSet1));
		
		System.out.println(hashSet2.size());
		//System.out.println(hashSet2);
		
		
		
	}

}
