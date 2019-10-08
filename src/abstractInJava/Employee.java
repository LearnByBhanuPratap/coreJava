package abstractInJava;

public class Employee extends Person {

	private int empId;

	public Employee(String nm, String gen, int id) {
		super(nm, gen);
		this.empId = id;
	}

	@Override
	public void work() {
		if (empId == 0) {
			System.out.println("Not working");
		} else {
			System.out.println("Working as employee");
		}
	}

	public static void main(String args[]) {
		Person student = new Employee("Test1", "Female", 0);
		Person employee = new Employee("Test2", "Male", 12);
		student.work();
		employee.work();
		System.out.println(employee.toString());
		employee.changeName("Test3");
		System.out.println(employee.toString());
	}

}
