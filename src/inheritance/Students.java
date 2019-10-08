package inheritance;

public class Students extends ClassRoom {

	int age;
	String name;

	public Students(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public static void main(String[] args) {
		Students students = new Students(10, "Mohan");
		System.out.println(students);
		Students students1 = new Students(10, "RAM");
		System.out.println(students1);
		Students students2 = new Students(10, "SOHAN");
		System.out.println(students2);
	}

	@Override
	public String toString() {
		return "Students [age=" + age + ", name=" + name + ", classRoom=" + classRoom + ", collegeName=" + collegeName
				+ "]";
	}

}
