package setClass;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CloningConcept {

	int i;
	int j;
	
	CloningConcept(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public HashSet<CloningConcept> testOriginalObject() {
		HashSet<CloningConcept> hashSet = new HashSet<CloningConcept>();
		hashSet.add(new CloningConcept(1, 2));
		hashSet.add(new CloningConcept(2, 2));
		hashSet.add(new CloningConcept(3, 2));
		return hashSet;
	}

	public HashSet<CloningConcept> getClonedObject() {
		return (HashSet<CloningConcept>) testOriginalObject().clone();
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
		return "CloningConcept [i=" + i + ", j=" + j + "]";
	}

	public static void main(String[] args) {

		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(100);
		hashSet.add(10);
		hashSet.add(50);
		System.out.println(hashSet);
		HashSet<Integer> clonedObject = (HashSet<Integer>) hashSet.clone();
		System.out.println(clonedObject);
		clonedObject.remove(100);
		System.out.println("------------");
		System.out.println("clonedObject=" + clonedObject);
		System.out.println("hashSet=" + hashSet);

		hashSet.remove(10);
		System.out.println("------------");
		System.out.println("hashSet=" + hashSet);
		System.out.println("clonedObject=" + clonedObject);

		System.out.println();
		System.out.println("=====LinkedHashSet Cloning===");

		LinkedHashSet<Integer> LinkedHashSet = new LinkedHashSet<Integer>();
		LinkedHashSet.add(100);
		LinkedHashSet.add(10);
		LinkedHashSet.add(50);
		System.out.println(LinkedHashSet);

		LinkedHashSet<Integer> clonedObject1 = (LinkedHashSet<Integer>) LinkedHashSet.clone();

		System.out.println(clonedObject1);

		clonedObject1.remove(100);

		System.out.println("------------");
		System.out.println("clonedObject=" + clonedObject1);
		System.out.println("LinkedHashSet=" + LinkedHashSet);

		LinkedHashSet.remove(10);

		System.out.println("------------");
		System.out.println("LinkedHashSet=" + LinkedHashSet);
		System.out.println("clonedObject=" + clonedObject1);

		System.out.println();

		System.out.println("=====TreeSet Cloning===");

		TreeSet<Integer> TreeSet = new TreeSet<Integer>();
		TreeSet.add(100);
		TreeSet.add(10);
		TreeSet.add(50);
		System.out.println(TreeSet);

		TreeSet<Integer> clonedObject2 = (TreeSet<Integer>) TreeSet.clone();

		System.out.println(clonedObject2);

		clonedObject2.remove(100);
		System.out.println("------------");
		System.out.println("clonedObject=" + clonedObject2);
		System.out.println("TreeSet=" + TreeSet);

		TreeSet.remove(10);

		System.out.println("------------");
		System.out.println("TreeSet=" + TreeSet);
		System.out.println("clonedObject=" + clonedObject2);
	}

}
