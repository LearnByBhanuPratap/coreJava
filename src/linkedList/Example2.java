package linkedList;

import java.util.LinkedList;

public class Example2 {

	public static void main(String[] args) {
		{
			LinkedList<String> linkedList = new LinkedList<>();

			linkedList.add("A");
			linkedList.add("B");
			linkedList.add("C");
			linkedList.add("D");

			System.out.println(linkedList.get(0));
			System.out.println(linkedList.getFirst());
			System.out.println(linkedList.getLast());
		}
	}
}
