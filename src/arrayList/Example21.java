package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Example21 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 10, 20, 30, 40, 50, 60, 70, 80, 90));

		ArrayList<Integer> sublist = new ArrayList<Integer>(list.subList(2, 6));

		System.out.println(sublist);
	}

}
