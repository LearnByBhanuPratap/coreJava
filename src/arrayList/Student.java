package arrayList;

public class Student {

	private int age;
	private String name;
	private String school;

	public Student(int age, String name, String school) {
		super();
		this.age = age;
		this.name = name;
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", school=" + school + "]";
	}

}
