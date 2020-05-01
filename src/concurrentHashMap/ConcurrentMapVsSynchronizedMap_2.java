package concurrentHashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentMapVsSynchronizedMap_2 {

	// ConcurrentHashMap<Integer, String> conHashMap = new ConcurrentHashMap<Integer, String>();

	HashMap<Integer, String> map = new HashMap<Integer, String>();
	Map<Integer, String> conHashMap = Collections.synchronizedMap(map);

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(4);

		ConcurrentMapVsSynchronizedMap_2 ob = new ConcurrentMapVsSynchronizedMap_2();
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
				conHashMap.putIfAbsent(i, "A" + i);
			}
		}
	};

	Runnable writeThreaTwo = new Runnable() {
		@Override
		public void run() {
			for (int i = 1; i <= 1000; i++) {
				conHashMap.put(i, "B" + i);
			}
		}
	};

	Runnable readThreaOne = new Runnable() {
		@Override
		public void run() {
				Iterator<Integer> ite = conHashMap.keySet().iterator();
				while (ite.hasNext()) {
					Integer key = ite.next();
					System.out.println(key + " : " + conHashMap.get(key));
				}
		
		}
	};

	Runnable readThreaTwo = new Runnable() {
		@Override
		public void run() {
				Iterator<Integer> ite = conHashMap.keySet().iterator();
				while (ite.hasNext()) {
					Integer key = ite.next();
					System.out.println(key + " : " + conHashMap.get(key));
				}	
		}
	};
}