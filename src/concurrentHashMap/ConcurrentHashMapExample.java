package concurrentHashMap;

import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentHashMapExample {

	ConcurrentHashMap<Integer, String> dataMap = new ConcurrentHashMap<Integer, String>();

	public static void main(String[] args) {
		

		ExecutorService service = Executors.newFixedThreadPool(3);

		ConcurrentHashMapExample concurrentHashMapExample = new ConcurrentHashMapExample();

		service.execute(concurrentHashMapExample.writeThread2);
		service.execute(concurrentHashMapExample.writeThread1);
		service.execute(concurrentHashMapExample.readThread2);
		service.shutdown();
	}

	Runnable writeThread2 = new Runnable() {

		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				dataMap.put(i, String.valueOf(i + Thread.currentThread().getId()));
			}

		}
	};

	Runnable writeThread1 = new Runnable() {

		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				dataMap.put(i, String.valueOf(i + Thread.currentThread().getId()));
			}

		}
	};

	Runnable readThread2 = new Runnable() {

		@Override
		public void run() {
			for (Entry<Integer, String> entry : dataMap.entrySet()) {
				System.out.println(entry.getValue());

			}

		}
	};
}
