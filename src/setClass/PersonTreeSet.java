package setClass;

import java.util.Comparator;
import java.util.TreeSet;

public class PersonTreeSet {

	private String name;
	private Integer age;

	public PersonTreeSet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public PersonTreeSet() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonTreeSet [name=" + name + ", age=" + age + "]";
	}

	Comparator<PersonTreeSet> ageComparator = new Comparator<PersonTreeSet>() {

		@Override
		public int compare(PersonTreeSet o1, PersonTreeSet o2) {
			return o1.getAge().compareTo(o2.getAge());
		}
	};

	Comparator<PersonTreeSet> nameComparator = new Comparator<PersonTreeSet>() {

		@Override
		public int compare(PersonTreeSet o1, PersonTreeSet o2) {
			return o1.getName().compareTo(o2.getName());
		}
	};

	public static void main(String[] args) {
		
		PersonTreeSet personTreeSet = new PersonTreeSet();
		
		TreeSet<PersonTreeSet> personTreeSets = new TreeSet<PersonTreeSet>(new AgeComparator());
		personTreeSets.add(new PersonTreeSet("CC", 40));
		personTreeSets.add(new PersonTreeSet("DD", 20));
		personTreeSets.add(new PersonTreeSet("AA", 30));

		System.out.println(personTreeSets);
		
		TreeSet<PersonTreeSet> personTreeSets1 = new TreeSet<PersonTreeSet>(personTreeSet.nameComparator);
		personTreeSets1.add(new PersonTreeSet("CC", 40));
		personTreeSets1.add(new PersonTreeSet("DD", 20));
		personTreeSets1.add(new PersonTreeSet("AA", 30));

		System.out.println(personTreeSets1);

	}
}
