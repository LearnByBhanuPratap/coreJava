package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Example2 implements ParentClass {

	@Override
	public void add() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test() {
		// TODO Auto-generated method stub

	}

	public void corona() {

	}

	public static void main(String[] args) {

		ParentClass parentClass = new Example2();
		parentClass.add();
		parentClass.test();
		// call of this method not possible
		// parentClass.corona()

		Example2 parentClass1 = new Example2();
		parentClass1.add();
		parentClass1.test();
		parentClass1.corona();

		LinkedList<String> linkedList = new LinkedList<>();

		List<String> list = new LinkedList<>();

		List<String> list2 = new ArrayList<>();

		List<String> list3 = new Vector<String>();

		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");

		System.out.println(linkedList.get(0));
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());

	}

}
