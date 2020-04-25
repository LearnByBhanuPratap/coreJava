package arrayList;

import java.util.Comparator;

public class DistrictSorter implements Comparator<State>{

	@Override
	public int compare(State o1, State o2) {
		return o1.getDistrict().compareTo(o2.getDistrict());
	}

}
