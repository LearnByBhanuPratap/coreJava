package mapClass;

public class School {

	private String name;
	private String age;
	private String schoolName;
	
	
	public School(String name, String age, String schoolName) {
		this.name = name;
		this.age = age;
		this.schoolName = schoolName;
	}


	@Override
	public String toString() {
		return "School [name=" + name + ", age=" + age + ", schoolName=" + schoolName + "]";
	}
	

}
