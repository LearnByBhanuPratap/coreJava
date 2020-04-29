package mapClass;

import java.util.*;

public class ceilingEntry1 {

	public static void main(String[] args) {

		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();

		//treemap.put(null, "two");
		treemap.put(2, "two");
		treemap.put(7, "seven");
		treemap.put(3, "three");
		treemap.put(30, "four");
		treemap.put(40, "five");
		treemap.put(50, "six");

		System.out.println("The next greater key-value of 12 is : " + treemap.ceilingEntry(12));

		System.out.println("The next greater key-value of 80 is : " + treemap.ceilingEntry(80));
		
		System.out.println("The key-value of 40 is : " + treemap.ceilingEntry(40));
		
		//System.out.println("The key-value of null is : " + treemap.ceilingEntry(null));

		System.out.println("The next greater key of 12 is : " + treemap.ceilingKey(12));

		System.out.println("The next greater key of 80 is : " + treemap.ceilingKey(80));
		
		System.out.println("The key of 40 is : " + treemap.ceilingKey(40));
		
		//System.out.println("The key of 40 is : " + treemap.ceilingKey(null));

	}
}