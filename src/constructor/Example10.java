package constructor;

public class Example10 {

	private String name;
	private int age;
	private String state;

	public Example10(String name, int age, String state) {
		this.name = name;
		this.age = age;
		this.state = state;
	}

	public Example10(int age, String name, String state) {
		this.name = name;
		this.age = age;
		this.state = state;
	}
	
	public static void main(String[] args) {
		
	}

}
