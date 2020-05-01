package concurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;

public class ComputeMethods_1 {

	public static void main(String[] args) {

		ConcurrentHashMap<Integer, String> conHashMap = new ConcurrentHashMap<Integer, String>();

		conHashMap.put(10, "Test1");
		conHashMap.put(11, "Test1");
		System.out.println(conHashMap);
		
		conHashMap.compute(1, (k, v) -> (v == null) ? "I an null" : v.concat("compute"));

		conHashMap.compute(11, (k, v) -> v.concat("compute"));
		System.out.println(conHashMap);

		conHashMap.computeIfAbsent(12, (k) -> "i am absent");

		conHashMap.computeIfAbsent(11, (k) -> "i am absent");

		System.out.println(conHashMap);

		conHashMap.computeIfPresent(10, (k, v) -> v.concat("I am present"));
		conHashMap.computeIfPresent(20, (k, v) -> v.concat("I am present"));
		System.out.println(conHashMap);

	}

}
