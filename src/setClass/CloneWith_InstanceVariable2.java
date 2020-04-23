package setClass;

import java.util.HashSet;

public class CloneWith_InstanceVariable2 {
	
	public static void main(String[] args) {
		
		HashSet<String> original = new HashSet<String>();
		original.add("3000");
		original.add("2000");
		original.add("2000");
		
		// Cloning will give one copy of object
		HashSet<String> cloned = (HashSet<String>)original.clone();
		System.out.println("Original Object=="+original);
		System.out.println("Cloned Object=="+cloned);
		
		// Modifying clone object
		cloned.add("80");
		
		System.out.println("Original Object=="+original);
		System.out.println("Cloned Object=="+cloned);
		
		// Modifying original object
		original.add("800");
		
		System.out.println("Original Object=="+original);
		System.out.println("Cloned Object=="+cloned);
	}

}
