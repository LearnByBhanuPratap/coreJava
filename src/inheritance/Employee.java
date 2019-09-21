package inheritance;

public class Employee {
	
	int id;
	String name;
	Address address;

	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}

	public static void main(String[] args) {
		Address address1 = new Address("test1", "BIHAR", "india");
		Address address2 = new Address("test2", "BIHAR", "india");

		Employee e = new Employee(11, "Ram", address1);
		Employee e2 = new Employee(12, "Mohan", address2);

		e.display();
		e2.display();

	}
}