package concurrentHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * https://www.youtube.com/user/MrBhanupratap29/playlists
 * https://github.com/LearnByBhanuPratap
 *
 */
public class ConcurrentMapVsMap_2 {

	HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

	public static void main(String[] args) {

		ConcurrentMapVsMap_2 ob = new ConcurrentMapVsMap_2();

		for (int i = 1; i <= 1000; i++) {
			ob.hashMap.put(i, "A" + i);
		}

		//System.out.println(ob.hashMap);
		
		ExecutorService service = Executors.newFixedThreadPool(2);

		service.execute(ob.readThreaOne);
		service.execute(ob.readThreaTwo);

		service.shutdownNow();
	}

	Runnable readThreaOne = new Runnable() {
		@Override
		public void run() {
			// Set<Integer> keys = hashMap.keySet();
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