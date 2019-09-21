package arrayList;

import java.util.Comparator;

public class LanguageSorter implements Comparator<State> {

	@Override
	public int compare(State o1, State o2) {
		return o1.getLanguage().compareToIgnoreCase(o2.getLanguage());
	}
}
