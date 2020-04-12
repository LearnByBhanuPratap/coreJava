package arrayList;

public class Employee1 implements Cloneable {

	private int empoyeeId;
	private String employeeName;
	private Department1 department;

	public Employee1(int id, String name, Department1 dept) {
		this.empoyeeId = id;
		this.employeeName = name;
		this.department = dept;
	}

	// Modified clone() method in Employee class
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Employee1 cloned = (Employee1) super.clone();

		Department1 clonedDepartment = (Department1) cloned.getDepartment().clone();
		
		cloned.setDepartment(clonedDepartment);
		
		return cloned;
	}

	public int getEmpoyeeId() {
		return empoyeeId;
	}

	public void setEmpoyeeId(int empoyeeId) {
		this.empoyeeId = empoyeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Department1 getDepartment() {
		return department;
	}

	public void setDepartment(Department1 department) {
		this.department = department;
	}
}
