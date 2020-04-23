package setClass;

import java.util.HashSet;

/**
 * 
 * @author bsingh5
 * 
 * This clone will give us shallow copy
 */
public class CloneWith_Reference2 {

	private int i;

	private int j;

	public CloneWith_Reference2(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	@Override
	public String toString() {
		return "CloneWith_ReferenceVariable3 [i=" + i + ", j=" + j + "]";
	}

	public static void main(String[] args) {

		HashSet<CloneWith_Reference2> original = new HashSet<CloneWith_Reference2>();
		
		original.add(new CloneWith_Reference2(2, 3));

		// Cloning will give one copy of object
		HashSet<CloneWith_Reference2> cloned = (HashSet<CloneWith_Reference2>) original.clone();
		
		System.out.println("Original Object==" + original);
		System.out.println("Cloned Object==" + cloned);
		
		System.out.println(original == cloned);
		
		System.out.println("Original Object==" + original.hashCode());
		System.out.println("Cloned Object==" + cloned.hashCode());
		
		System.out.println("------------------------");

		// Modifying clone object
		for (CloneWith_Reference2 cloneWith_ReferenceVariable3 : cloned) {
			cloneWith_ReferenceVariable3.setI(20);
			cloneWith_ReferenceVariable3.setJ(30);
		}

		System.out.println("Original Object==" + original);
		System.out.println("Cloned Object==" + cloned);
		System.out.println("------------------------");

		// Modifying original object
		for (CloneWith_Reference2 cloneWith_ReferenceVariable3 : original) {
			cloneWith_ReferenceVariable3.setI(200);
			cloneWith_ReferenceVariable3.setJ(300);
		}
		System.out.println("Original Object==" + original);
		System.out.println("Cloned Object==" + cloned);
	}

}
