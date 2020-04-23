package setClass;

import java.util.HashSet;

public class CloneWith_Reference4 {

	private int i;

	private int j;

	private EmployeeTest employee;

	public CloneWith_Reference4(int i, int j, EmployeeTest employee) {
		super();
		this.i = i;
		this.j = j;
		this.employee = employee;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public EmployeeTest getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeTest employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "CloneWith_Reference3 [i=" + i + ", j=" + j + ", employee=" + employee + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		HashSet<CloneWith_Reference4> original = new HashSet<CloneWith_Reference4>();

		original.add(new CloneWith_Reference4(2, 3, new EmployeeTest("Test", 30)));

		HashSet<CloneWith_Reference4> cloned = (HashSet<CloneWith_Reference4>) original.clone();

		System.out.println("Original Object==" + original);
		System.out.println("Cloned Object==" + cloned);

		System.out.println("Original Object==" + original.hashCode());
		System.out.println("Cloned Object==" + cloned.hashCode());

		System.out.println(original == cloned);

		System.out.println("------------------------");

		// Modifying clone object
		for (CloneWith_Reference4 cloneWith_ReferenceVariable4 : cloned) {
			cloneWith_ReferenceVariable4.setI(20);
			cloneWith_ReferenceVariable4.setJ(30);
			cloneWith_ReferenceVariable4.getEmployee().setName("clone");
			cloneWith_ReferenceVariable4.getEmployee().setAge(300);
		}

		System.out.println("Original Object==" + original);
		System.out.println("Cloned Object==" + cloned);
		System.out.println("------------------------");

		// Modifying original object
		for (CloneWith_Reference4 cloneWith_ReferenceVariable4 : original) {
			cloneWith_ReferenceVariable4.setI(200);
			cloneWith_ReferenceVariable4.setJ(300);
			cloneWith_ReferenceVariable4.getEmployee().setName("Original");
			cloneWith_ReferenceVariable4.getEmployee().setAge(3000);
		}
		System.out.println("Original Object==" + original);
		System.out.println("Cloned Object==" + cloned);
	}

}

class EmployeeTest {
	int age;
	String name;

	public EmployeeTest(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
		return "Employee [name=" + name + ", age=" + age + "]";
	}
}
