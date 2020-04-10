package arrayList;

public class Student {

	private int age;
	private String name;
	private String school;

	private Address address;

	public Student(int age, String name, String school, Address address) {
		super();
		this.age = age;
		this.name = name;
		this.school = school;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", school=" + school + ", address=" + address + "]";
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getSchool() {
		return school;
	}

	public Address getAddress() {
		return address;
	}

}
