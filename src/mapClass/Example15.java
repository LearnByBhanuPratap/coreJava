package mapClass;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Example15 {

	Comparator<Employee> ageComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {

			return o1.getAge().compareTo(o2.getAge());
		}
	};

	Comparator<Employee> nameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {

			return o1.getName().compareTo(o2.getName());
		}
	};

	public static void main(String[] args) {

		Example15 obj = new Example15();

		Map<Employee, Integer> treeMap = new TreeMap<Employee, Integer>(obj.ageComparator);

		treeMap.put(new Employee(50, "AA"), 5);
		treeMap.put(new Employee(20, "BB"), 1);
		treeMap.put(new Employee(30, "CC"), 3);
		treeMap.put(new Employee(40, "DD"), 2);
		treeMap.put(new Employee(500, "EE"), 500);

		System.out.println(treeMap);

		Map<Employee, Integer> treeMap1 = new TreeMap<Employee, Integer>(obj.nameComparator);

		treeMap1.put(new Employee(50, "AA"), 5);
		treeMap1.put(new Employee(20, "BB"), 1);
		treeMap1.put(new Employee(30, "CC"), 3);
		treeMap1.put(new Employee(40, "DD"), 2);
		treeMap1.put(new Employee(500, "EE"), 500);

		System.out.println(treeMap1);
	}

}

class Employee {

	private Integer age;

	private String name;

	public Employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
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
