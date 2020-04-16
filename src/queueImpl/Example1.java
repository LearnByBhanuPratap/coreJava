package queueImpl;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Example1 {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<Integer>();
		System.out.println(queue.add(10));
		queue.add(10);
		queue.add(100);
		queue.offer(300);
		queue.offer(400);
		System.out.println(queue.offer(600));
		System.out.println(queue);
		
		System.out.println("-----------------------------");
		
		Queue<Integer> queue1 = new ArrayBlockingQueue<Integer>(1);
		queue1.add(10);
		// Exception in thread "main" java.lang.IllegalStateException: Queue full
		queue1.add(100);
		queue1.offer(300);
		queue1.offer(400);
		System.out.println(queue1.offer(600));
		System.out.println(queue1);
		
		System.out.println("-----------------------------");
		
		Queue<Integer> queue5 = new ArrayBlockingQueue<Integer>(1);
		System.out.println("queue5.offer(10)---->" + queue5.offer(10));
		queue5.offer(100);
		queue5.offer(300);
		queue5.offer(400);
		System.out.println("queue5.offer(600)---->" + queue5.offer(600));
		System.out.println(queue5);

		System.out.println("-----------------------------");

		Queue<Integer> queue2 = new ArrayDeque<Integer>(1);
		System.out.println("queue2.add(10)---->" + queue2.add(10));
		queue2.add(100);
		queue2.offer(300);
		queue2.offer(400);
		System.out.println("queue5.offer(600)---->" + queue2.offer(600));
		System.out.println(queue2);
		System.out.println("-----------------------------");
		
		Queue<Integer> queue3 = new LinkedBlockingQueue<Integer>(1);
		System.out.println("queue3.offer(10)---->" + queue3.add(10));
		// Exception in thread "main" java.lang.IllegalStateException: Queue full
		queue3.add(100);
		queue3.offer(300);
		queue3.offer(400);
		System.out.println("queue5.offer(600)---->" + queue3.offer(600));
		System.out.println(queue3);
		System.out.println("-----------------------------");
		
		Queue<Integer> queue4 = new LinkedBlockingQueue<Integer>(1);
		System.out.println("queue3.offer(10)---->" + queue4.offer(10));
		System.out.println(queue4.offer(10000));
		System.out.println(queue4.offer(300));
		System.out.println(queue4.offer(400));
		System.out.println("queue5.offer(600)---->" + queue4.offer(600));
		System.out.println(queue4);

	}

}
