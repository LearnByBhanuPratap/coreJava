
public class Employee implements Comparable<Employee> {
	String name;

	@Override
	public int compareTo(Employee o) {

		return name.compareTo(o.name);
	}

}
