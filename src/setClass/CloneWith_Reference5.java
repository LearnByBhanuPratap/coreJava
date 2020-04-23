package setClass;

import java.util.HashSet;
import java.util.Iterator;

public class CloneWith_Reference5 implements Cloneable {

	private int i;

	private int j;

	private EmployeeTestLocal employee;

	public CloneWith_Reference5(int i, int j, EmployeeTestLocal employee) {
		super();
		this.i = i;
		this.j = j;
		this.employee = employee;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (CloneWith_Reference5) super.clone();
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

	public EmployeeTestLocal getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeTestLocal employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "CloneWith_Reference5 [i=" + i + ", j=" + j + ", employee=" + employee + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		HashSet<CloneWith_Reference5> original = new HashSet<CloneWith_Reference5>();

		original.add(new CloneWith_Reference5(2, 3, new EmployeeTestLocal("Test", 30)));

		HashSet<CloneWith_Reference5> cloned = new HashSet<CloneWith_Reference5>();

		Iterator<CloneWith_Reference5> itr = original.iterator();

		while (itr.hasNext()) {

			CloneWith_Reference5 next = (CloneWith_Reference5) itr.next().clone();

			EmployeeTestLocal emp = (EmployeeTestLocal) next.getEmployee().clone();

			next.setEmployee(emp);

			cloned.add(next);
		}

		System.out.println("Original Object==" + original);
		System.out.println("Cloned Object==" + cloned);

		System.out.println("Original Object==" + original.hashCode());
		System.out.println("Cloned Object==" + cloned.hashCode());

		System.out.println("------------------------");

		// Modifying clone object
		for (CloneWith_Reference5 cloneWith_ReferenceVariable5 : cloned) {
			cloneWith_ReferenceVariable5.setI(20);
			cloneWith_ReferenceVariable5.setJ(30);

			cloneWith_ReferenceVariable5.getEmployee().setName("clone");
			cloneWith_ReferenceVariable5.getEmployee().setAge(300);
		}

		System.out.println("Original Object==" + original);
		System.out.println("Cloned Object==" + cloned);
		System.out.println("------------------------");

		// Modifying original object
		for (CloneWith_Reference5 cloneWith_ReferenceVariable5 : original) {
			cloneWith_ReferenceVariable5.setI(200);
			cloneWith_ReferenceVariable5.setJ(300);
			cloneWith_ReferenceVariable5.getEmployee().setName("Original");
			cloneWith_ReferenceVariable5.getEmployee().setAge(3000);
		}
		System.out.println("Original Object==" + original);
		System.out.println("Cloned Object==" + cloned);
	}

}

class EmployeeTestLocal implements Cloneable {
	private int age;
	private String name;

	public EmployeeTestLocal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (EmployeeTestLocal) super.clone();
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
