package setClass;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 
 * @author Bhanu Pratap Singh
 * 
 *  This Example will give us deep copy
 */
public class CloneWith_Reference3 implements Cloneable {

	private int i;

	private int j;

	public CloneWith_Reference3(int i, int j) {
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
		return "CloneWith_Reference3 [i=" + i + ", j=" + j + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		HashSet<CloneWith_Reference3> original = new HashSet<CloneWith_Reference3>();
		
		original.add(new CloneWith_Reference3(2, 3));

		HashSet<CloneWith_Reference3> cloned = new HashSet<CloneWith_Reference3>();

		Iterator<CloneWith_Reference3> itr = original.iterator();

		while (itr.hasNext()) {
			CloneWith_Reference3 next = (CloneWith_Reference3) itr.next().clone();
			cloned.add(next);
		}

		System.out.println("Original Object==" + original);
		System.out.println("Cloned Object==" + cloned);
		System.out.println(original == cloned);
		System.out.println("Original Object==" + original.hashCode());
		System.out.println("Cloned Object==" + cloned.hashCode());
		System.out.println("------------------------");

		// Modifying clone object
		for (CloneWith_Reference3 cloneWith_ReferenceVariable3 : cloned) {
			cloneWith_ReferenceVariable3.setI(20);
			cloneWith_ReferenceVariable3.setJ(30);
		}

		System.out.println("Original Object==" + original);
		System.out.println("Cloned Object==" + cloned);
		System.out.println("------------------------");

		// Modifying original object
		for (CloneWith_Reference3 cloneWith_ReferenceVariable3 : original) {
			cloneWith_ReferenceVariable3.setI(200);
			cloneWith_ReferenceVariable3.setJ(300);
		}
		System.out.println("Original Object==" + original);
		System.out.println("Cloned Object==" + cloned);
	}

}
