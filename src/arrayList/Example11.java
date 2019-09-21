package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Example11 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>(
				Arrays.asList("test1", "test2", "test3", "test4", "test5", "test6", "test7", "test8"));

		int firstIndex = list.indexOf("test3");

		System.out.println(firstIndex);

		firstIndex = list.indexOf("hello");

		System.out.println(firstIndex);
	}
}
