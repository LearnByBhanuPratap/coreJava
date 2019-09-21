package encapsulationInJava;

public class Example3 {

	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {

		if (age < 10) {
			throw new Exception("age should not be less than 10");
		}
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		if (name == null || name == "") {
			throw new Exception("name should not be empty or null");

		}
		this.name = name;
	}

}
