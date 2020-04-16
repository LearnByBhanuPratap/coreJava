package queueImpl;

import java.util.LinkedList;
import java.util.Queue;

public class Example2 {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(100);
		queue.offer(300);
		queue.offer(400);
		System.out.println("actual queue---->" + queue);
		System.out.println(queue.element());
		System.out.println("queue.element()---->" + queue);

		System.out.println(queue.peek());
		System.out.println("queue.peek()---->" + queue);

		System.out.println(queue.poll());
		System.out.println("queue.poll()---->" + queue);

		System.out.println(queue.remove());
		System.out.println("queue.remove()---->" + queue);

		Queue<Integer> queue1 = new LinkedList<Integer>();

		System.out.println("---------------------------");
		// Exception in thread "main" java.util.NoSuchElementException
		System.out.println(queue1.element());

		System.out.println(queue1.peek());

		System.out.println(queue1.poll());

		// Exception in thread "main" java.util.NoSuchElementException
		System.out.println(queue1.remove());
	}
}
