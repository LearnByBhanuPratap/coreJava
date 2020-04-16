package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestState2Sorting {

	public static void main(String[] args) {

		State2 state = new State2();

		List<State2> list = new ArrayList<State2>();

		list.add(new State2(100, "AB", "BB"));
		list.add(new State2(500, "DC", "CC"));
		list.add(new State2(300, "BC", "AA"));
		list.add(new State2(800, "FC", "FF"));
		list.add(new State2(600, "ED", "EE"));
		System.out.println(list);

		Comparator<State2> pSorter = state.populationSorter;
		Collections.sort(list, pSorter);

		System.out.println(list);

		Collections.sort(list, state.languageSorter);

		System.out.println(list);

		Collections.sort(list, state.districtSorter);
		System.out.println(list);

	}

}
