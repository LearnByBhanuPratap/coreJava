package CloningOfCollectionInJava;

class Employee2{

	private String name;
	private String designation;

	public Employee2(String name, String designation) {
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
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + "]";
	}
}
