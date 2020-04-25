package setClass;

import java.util.TreeSet;

public class PersonTreeSet2 implements Comparable<PersonTreeSet2> {

	private String name;
	private int age;

	Integer i;

	String s;

	Float f;

	public PersonTreeSet2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(PersonTreeSet2 o) {
		return name.compareTo(o.getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonTreeSet [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {

		TreeSet<PersonTreeSet2> personTreeSets = new TreeSet<PersonTreeSet2>();
		personTreeSets.add(new PersonTreeSet2("CC", 40));
		personTreeSets.add(new PersonTreeSet2("DD", 20));
		personTreeSets.add(new PersonTreeSet2("AA", 30));

		System.out.println(personTreeSets);

	}
}
