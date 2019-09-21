package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Example22 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(2);

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		// Convert to object array
		Object[] array = list.toArray();

		System.out.println(Arrays.toString(array));

		// Iterate and convert to desired type
		for (Object o : array) {
			String s = (String) o;

			System.out.println(s);
		}
	}
}
