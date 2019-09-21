package arrayList;

import java.util.Comparator;

public class PopulationSorter implements Comparator<State> {

	@Override
	public int compare(State o1, State o2) {
		if (o1.getPopulation() == o2.getPopulation())
			return 0;
		else if (o1.getPopulation() > o2.getPopulation())
			return 1;
		else
			return -1;
	}
}
