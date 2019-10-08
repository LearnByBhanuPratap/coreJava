package abstractInJava;

public abstract class Person {

	private String name;
	private String gender;

	public Person(String nm, String gen) {
		this.name = nm;
		this.gender = gen;
	}

	public abstract void work();

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}

	public void changeName(String newName) {
		this.name = newName;
	}
}
