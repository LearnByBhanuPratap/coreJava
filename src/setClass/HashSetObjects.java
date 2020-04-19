package setClass;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetObjects {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();
		set.add(20);
		System.out.println(set);

		Set<Integer> set2 = new HashSet<Integer>(80);

		Set<Integer> set3 = new HashSet<Integer>(16, 0.75f);

		Set<Integer> set4 = new HashSet<Integer>(set);

		Set<Integer> set5 = new HashSet<Integer>();
		set.add(20);
		System.out.println(set);

		Set<Integer> set6 = new LinkedHashSet<Integer>(80);

		Set<Integer> set7 = new LinkedHashSet<Integer>(16, 0.75f);

		Set<Integer> set8 = new LinkedHashSet<Integer>(set);

		Set<Integer> set12 = new LinkedHashSet<Integer>();

		System.out.println(set4);

		Set<Integer> set9 = new TreeSet<Integer>();

		Set<Integer> set11 = new TreeSet<Integer>(set);

		System.out.println(set4);

		HashSet<Integer> set20 = new HashSet<Integer>(80);

		HashSet<Integer> set30 = new HashSet<Integer>(16, 0.75f);

		HashSet<Integer> set40 = new HashSet<Integer>(set);

		HashSet<Integer> set50 = new LinkedHashSet<Integer>();
	}

}
