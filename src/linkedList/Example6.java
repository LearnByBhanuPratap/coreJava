package linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Example6 {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("D");
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");
		System.out.println(linkedList);

		Object[] arrayLinkedList = linkedList.toArray();

		System.out.println(Arrays.toString(arrayLinkedList));

		System.out.println(linkedList.lastIndexOf("D"));

		System.out.println(linkedList.indexOf("D"));

		System.out.println(linkedList.set(1, "CCCCCC"));
		System.out.println(linkedList);
		System.out.println(linkedList.size());

		Object[] arrayLinkedList1 = linkedList.toArray(arrayLinkedList);
		System.out.println(Arrays.toString(arrayLinkedList1));
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		
		Stack<Integer> stack = new Stack<Integer>();


	}

}
