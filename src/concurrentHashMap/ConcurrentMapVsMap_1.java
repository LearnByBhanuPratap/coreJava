package concurrentHashMap;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * https://www.youtube.com/user/MrBhanupratap29/playlists
 * https://github.com/LearnByBhanuPratap
 *
 */
public class ConcurrentMapVsMap_1 {


	HashMap<Integer, String> hahsMap = new HashMap<Integer, String>();

	public static void main(String[] args) throws InterruptedException {

		ExecutorService service = Executors.newFixedThreadPool(2);

		ConcurrentMapVsMap_1 ob = new ConcurrentMapVsMap_1();

		service.execute(ob.writeThreaOne);
		service.execute(ob.writeThreaTwo);
		
		service.shutdown();
		
		service.awaitTermination(20, TimeUnit.SECONDS);
		
		System.out.println(ob.hahsMap);
	}

	Runnable writeThreaOne = new Runnable() {
		
		@Override
		public void run() {
			for (int i = 1; i <= 10000; i++) {
				System.out.println(i);
				hahsMap.put(i, "A" + i);
			}
		}
	};

	Runnable writeThreaTwo = new Runnable() {
		@Override
		public void run() {
			for (int i = 1; i <= 10000; i++) {
				System.out.println(i);
				hahsMap.put(i, "B" + i);
			}
		}
	};

}