package setClass;

import java.util.Comparator;
import java.util.TreeSet;

public class AgeComparator implements Comparator<PersonTreeSet>{


	@Override
	public int compare(PersonTreeSet o1, PersonTreeSet o2) {
		return o1.getAge().compareTo(o2.getAge());
	}
	
	public static void main(String[] args) {
		PersonTreeSet personTreeSet = new PersonTreeSet();
		
		TreeSet<PersonTreeSet> personTreeSets = 
				new TreeSet<PersonTreeSet>(personTreeSet.ageComparator);
		
		personTreeSets.add(new PersonTreeSet("CC", 40));
		personTreeSets.add(new PersonTreeSet("DD", 20));
		personTreeSets.add(new PersonTreeSet("AA", 30));
		
		System.out.println(personTreeSets);
	}

}
