package concurrentHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentMapVsMap_4 {

	ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<Integer, String>();

	// HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(4);

		ConcurrentMapVsMap_4 ob = new ConcurrentMapVsMap_4();

		ob.hashMap.put(1, "20");

		service.execute(ob.writeThreaOne);
		service.execute(ob.writeThreaTwo);
		service.execute(ob.readThreaOne);
		service.execute(ob.readThreaTwo);

		service.shutdownNow();
	}

	Runnable writeThreaOne = new Runnable() {
		@Override
		public void run() {
			for (int i = 1; i <= 1000; i++) {
				hashMap.put(i, "A" + i);
			}
		}
	};

	Runnable writeThreaTwo = new Runnable() {
		@Override
		public void run() {
			for (int i = 1; i <= 1000; i++) {
				hashMap.put(i, "B" + i);
			}
		}
	};

	Runnable readThreaOne = new Runnable() {
		@Override
		public void run() {
			Iterator<Integer> ite = hashMap.keySet().iterator();
			while (ite.hasNext()) {
				Integer key = ite.next();
				System.out.println(key + " : " + hashMap.get(key));
			}
		}
	};

	Runnable readThreaTwo = new Runnable() {
		@Override
		public void run() {
			Iterator<Integer> ite = hashMap.keySet().iterator();
			while (ite.hasNext()) {
				Integer key = ite.next();
				System.out.println(key + " : " + hashMap.get(key));
			}
		}
	};
}