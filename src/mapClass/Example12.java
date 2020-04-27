package mapClass;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example12 {

	public static void main(String[] args) {
		Map<Integer, Person> map = new HashMap<Integer, Person>();
		map.put(Integer.valueOf(5), new Person(50, "Test5"));
		map.put(1, new Person(20, "Test1"));
		map.put(3, new Person(30, "Test3"));
		map.put(2, new Person(40, "Test3"));
		map.put(500, new Person(500, "Test500"));

		System.out.println(map);

		Map<Integer, Person> linkedHashMap = new LinkedHashMap<Integer, Person>();
		linkedHashMap.put(1, new Person(20, "Test1"));
		linkedHashMap.put(3, new Person(30, "Test3"));
		linkedHashMap.put(2, new Person(40, "Test2"));

		System.out.println(linkedHashMap);

		Map<Integer, Person> treeMap = new TreeMap<Integer, Person>();
		treeMap.put(1, new Person(20, "Test1"));
		treeMap.put(3, new Person(30, "Test3"));
		treeMap.put(2, new Person(40, "Test2"));
		treeMap.put(5, new Person(50, "Test5"));
		treeMap.put(500, new Person(500, "Test500"));

		System.out.println(treeMap);
	}

}

class Person {

	private int age;

	private String name;

	public Person(int age, String name) {
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
