package setClass;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClassWithCustomeObject {

	public static void main(String[] args) {

		String s1 = "test3";

		Integer i = 90;

		Set<Person1234> set = new HashSet<Person1234>();
		HashSet<Person1234> hashSet = new HashSet<Person1234>();

		hashSet.add(new Person1234(10, "Ram"));
		hashSet.add(new Person1234(20, "Mohammed"));
		hashSet.add(new Person1234(30, "Thomas"));

		System.out.println(hashSet);

		LinkedHashSet<Person1234> linkedHashSet = new LinkedHashSet<Person1234>();

		linkedHashSet.add(new Person1234(10, "Ram"));
		linkedHashSet.add(new Person1234(20, "Mohammed"));
		linkedHashSet.add(new Person1234(30, "Thomas"));

		System.out.println(linkedHashSet);

		// Exception in thread "main" java.lang.ClassCastException:
		// setClass.Person1234 cannot be cast to java.lang.Comparable
		TreeSet<Person1234> treeSet = new TreeSet<Person1234>();

		treeSet.add(new Person1234(10, "Ram"));
		treeSet.add(new Person1234(20, "Mohammed"));
		treeSet.add(new Person1234(30, "Thomas"));

		// System.out.println(treeSet);
	}
}

class Person1234 {

	int age;

	String name;

	public Person1234(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person1234 [age=" + age + ", name=" + name + "]";
	}

}
