package CloningOfCollectionInJava;

class Employee implements Cloneable {

	private String name;
	private String designation;

	public Employee(String name, String designation) {
		this.name = name;
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected Object clone() {
		Employee clone = null;
		try {
			clone = (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + "]";
	}
}
