package encapsulationInJava;

public class Example1 {

	private String name;
	
	public String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Example1 obj = new Example1();
		
		obj.age="20";
		
		Example1 obj1 = new Example1();
		
		System.out.println(obj1.age);
	}
}
