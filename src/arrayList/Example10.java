package arrayList;

import java.util.ArrayList;

public class Example10 {

	public static void main(String[] args) {
		{
			ArrayList<String> list = new ArrayList<>(2);
			list.add("A");
			list.add("B");
			list.add("C");
			list.add("D");
			System.out.println(list.indexOf("A") > 0); // true

			System.out.println(list.indexOf("Z") > 0); // false
		}
	}
}
