package linkedList;

import java.util.LinkedList;

public class Example5 {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");
		
		linkedList.offer("30");
		
		linkedList.offerFirst("offerFirst");
		
		linkedList.offerLast("offerLast");
		
		System.out.println(linkedList);
		
		System.out.println(linkedList.getFirst());
		
		System.out.println(linkedList.getLast());
		
		System.out.println(linkedList.peek());
		
		System.out.println(linkedList.peekFirst());
		
		System.out.println(linkedList.peekLast());
		
		System.out.println(linkedList);
		
		System.out.println(linkedList.poll());
		
		System.out.println(linkedList);
		
		System.out.println(linkedList.pollFirst());
		
		System.out.println(linkedList);
		
		System.out.println(linkedList.pollLast());
		
		System.out.println(linkedList);
		
		System.out.println(linkedList.pop());
		
		System.out.println(linkedList);
		
		linkedList.push("70000");
		System.out.println(linkedList);

	}

}
