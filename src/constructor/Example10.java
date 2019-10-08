package constructor;

public class Example10 extends Object{

	private String name;
	private int age;
	private String state;

	public Example10(String name, int age, String state) {
		System.out.println("Example10(String name, int age, String state)");
		this.name = name;
		this.age = age;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Example10 [name=" + name + ", age=" + age + ", state=" + state + "]";
	}

	public Example10(int age, String name, String state) {
		this.name = name;
		this.age = age;
		this.state = state;
	}
	
	public static void main(String[] args) {
		Example10 obj = new Example10(10, "Test1", "Bihar");
		System.out.println(obj);
		Example10 obj1 = new Example10("Test2", 20, "Bihar1");
		System.out.println(obj1);
	}

}
