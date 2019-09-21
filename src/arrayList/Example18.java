package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Example18 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Shyam");
		list.add("Bdanu");
		list.add("Ram");
		list.add("Amit");
		list.add("Baoy");

		System.out.println("before sorting=" + list);

		Collections.sort(list);

		System.out.println("After sorting=" + list);
	}
}
