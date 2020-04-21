package setClass;

import java.util.HashSet;
import java.util.Iterator;

public class TestCloningConcept {

	public static void main(String[] args) {
		CloningConcept cloningConcept = new CloningConcept(2, 3);

		HashSet<CloningConcept> original = cloningConcept.testOriginalObject();
		System.out.println("original Object=" + original);

		HashSet<CloningConcept> clonedObject = cloningConcept.getClonedObject();
		System.out.println("cloned Object=" + clonedObject);

		System.out.println("==Modified Cloned Object=====");
		Iterator<CloningConcept> clonedData = clonedObject.iterator();
		while (clonedData.hasNext()) {
			clonedData.next().setJ(10000);
		}

		System.out.println("original Object=" + original);
		System.out.println("cloned Object=" + clonedObject);

		System.out.println("==Modified Original Object=====");

		Iterator<CloningConcept> originalData = original.iterator();
		while (originalData.hasNext()) {
			originalData.next().setJ(700);
		}

		System.out.println("original Object=" + original);
		System.out.println("cloned Object=" + clonedObject);
	}

}
