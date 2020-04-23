package setClass;

import java.util.HashSet;

public class CloneWith_InstanceVariable {
	
	public static void main(String[] args) {
		
		HashSet<Integer> original = new HashSet<Integer>();
		
		original.add(3000);
		original.add(2000);
		original.add(2000);
		
		// Cloning will give one copy of object
		HashSet<Integer> cloned = (HashSet<Integer>)original.clone();
		
		System.out.println("Original Object=="+original);
		System.out.println("Cloned Object=="+cloned);
		
		// Modifying clone object
		cloned.add(80);
		
		System.out.println("Original Object=="+original);
		System.out.println("Cloned Object=="+cloned);
		
		// Modifying original object
		original.add(800);
		
		System.out.println("Original Object=="+original);
		System.out.println("Cloned Object=="+cloned);
		
		cloned.remove(3000);
		original.remove(2000);
		System.out.println("Original Object=="+original);
		System.out.println("Cloned Object=="+cloned);
	}

}
