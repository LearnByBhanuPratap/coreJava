package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Example12 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(
				Arrays.asList("test7", "test2", "test3", "test4", "test5", "tset6", "trset7", "test8"));

		int lastIndex = list.lastIndexOf("test7");

		System.out.println(lastIndex);

		lastIndex = list.lastIndexOf("hello");

		System.out.println(lastIndex);
	}

}
