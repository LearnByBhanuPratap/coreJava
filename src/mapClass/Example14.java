package mapClass;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example14 {

	public static void main(String[] args) {
		Map<Person1, Integer> map = new HashMap<Person1, Integer>();
		map.put(new Person1(50, "Test5"), 5);
		map.put(new Person1(20, "Test1"), 1);
		map.put(new Person1(30, "Test3"), 3);
		map.put(new Person1(40, "Test3"), 2);
		map.put(new Person1(500, "Test500"), 500);

		System.out.println(map);

		Map<Person1, Integer> linkedHashMap = new LinkedHashMap<Person1, Integer>();
		linkedHashMap.put(new Person1(50, "Test5"), 5);
		linkedHashMap.put(new Person1(20, "Test1"), 1);
		linkedHashMap.put(new Person1(30, "Test3"), 3);
		linkedHashMap.put(new Person1(40, "Test3"), 2);
		linkedHashMap.put(new Person1(500, "Test500"), 500);

		System.out.println(linkedHashMap);

		// Exception in thread "main" java.lang.ClassCastException: mapClass.Person
		// cannot be cast to java.lang.Comparable
		Map<Person1, Integer> treeMap = new TreeMap<Person1, Integer>();
		treeMap.put(new Person1(50, "Test5"), 5);
		treeMap.put(new Person1(20, "Test1"), 1);
		treeMap.put(new Person1(30, "Test3"), 3);
		treeMap.put(new Person1(40, "Test3"), 2);
		treeMap.put(new Person1(500, "Test500"), 500);

		System.out.println(treeMap);
	}

}

class Person1 {

	private int age;

	private String name;

	public Person1(int age, String name) {
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
		return "Person [age=" + age + ", name=" + name + "]";
	}

}
