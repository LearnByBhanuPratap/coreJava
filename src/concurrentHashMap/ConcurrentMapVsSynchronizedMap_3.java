package concurrentHashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentMapVsSynchronizedMap_3 {

	// ConcurrentHashMap<Integer, String> conHashMap = new ConcurrentHashMap<Integer, String>();

	HashMap<Integer, String> map = new HashMap<Integer, String>();
	Map<Integer, String> conHashMap = Collections.synchronizedMap(map);
	
	HashMap<Integer, String> map1 = new HashMap<Integer, String>();	
	
	void display() {
		System.out.println(map1);
	}

	public static void main(String[] args) throws InterruptedException {

		ExecutorService service = Executors.newFixedThreadPool(4);

		ConcurrentMapVsSynchronizedMap_3 ob = new ConcurrentMapVsSynchronizedMap_3();
		service.execute(ob.writeThreaOne);
		service.execute(ob.writeThreaTwo);
		service.execute(ob.readThreaOne);
		service.execute(ob.readThreaTwo);
		
		service.shutdownNow();
		service.awaitTermination(20, TimeUnit.SECONDS);
		
		System.out.println(ob.map1);
		
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
			
			conHashMap.forEach((k,v)-> System.out.println(v));
		}
	};

	Runnable readThreaTwo = new Runnable() {
		@Override
		public void run() {
			conHashMap.forEach((k,v)-> map1.put(k, v));
		}
	};
	
}