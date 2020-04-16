package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class State2 {

	private int population;
	private String district;
	private String language;

	State2() {

	}

	public State2(int population, String district, String language) {
		super();
		this.population = population;
		this.district = district;
		this.language = language;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "State [population=" + population + ", district=" + district + ", language=" + language + "]";
	}

	Comparator<State2> populationSorter = new Comparator<State2>() {

		@Override
		public int compare(State2 o1, State2 o2) {
			if (o1.getPopulation() == o2.getPopulation())
				return 0;
			else if (o1.getPopulation() > o2.getPopulation())
				return 1;
			else
				return -1;
		}
	};

	Comparator<State2> districtSorter = new Comparator<State2>() {

		@Override
		public int compare(State2 o1, State2 o2) {
			return o1.getDistrict().compareTo(o2.getDistrict());
		}
	};

	Comparator<State2> languageSorter = new Comparator<State2>() {

		@Override
		public int compare(State2 o1, State2 o2) {
			return o1.getLanguage().compareTo(o2.getLanguage());
		}
	};

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
		list.sort(state.populationSorter);

		System.out.println(list);

		Collections.sort(list, state.languageSorter);

		System.out.println(list);

		Collections.sort(list, state.districtSorter);
		System.out.println(list);
	}
}
