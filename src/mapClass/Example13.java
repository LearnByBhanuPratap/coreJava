package mapClass;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example13 {

	public static void main(String[] args) {

		Map<Person2, Integer> map = new HashMap<Person2, Integer>();

		map.put(new Person2(50, "Test5"), 5);
		map.put(new Person2(20, "Test1"), 1);
		map.put(new Person2(30, "Test3"), 3);
		map.put(new Person2(40, "Test3"), 2);
		map.put(new Person2(500, "Test500"), 500);

		System.out.println(map);

		Map<Person2, Integer> linkedHashMap = new LinkedHashMap<Person2, Integer>();

		linkedHashMap.put(new Person2(50, "Test5"), 5);
		linkedHashMap.put(new Person2(20, "Test1"), 1);
		linkedHashMap.put(new Person2(30, "Test3"), 3);
		linkedHashMap.put(new Person2(40, "Test3"), 2);
		linkedHashMap.put(new Person2(500, "Test500"), 500);

		System.out.println(linkedHashMap);

		Map<Person2, Integer> treeMap = new TreeMap<Person2, Integer>();

		treeMap.put(new Person2(50, "Test5"), 5);
		treeMap.put(new Person2(20, "Test1"), 1);
		treeMap.put(new Person2(30, "Test3"), 3);
		treeMap.put(new Person2(40, "Test3"), 2);
		treeMap.put(new Person2(500, "Test500"), 500);

		System.out.println(treeMap);
	}

}

class Person2 implements Comparable<Person2> {

	private Integer age;

	private String name;

	public Person2(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Person2 o) {
		return this.getAge().compareTo(o.getAge());
		// return name.compareTo(o.getName());
	}

	public Integer getAge() {
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
