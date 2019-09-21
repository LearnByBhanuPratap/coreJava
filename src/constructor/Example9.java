package constructor;

public class Example9 {

	private String name;
	private int age;
	private String state;

	public Example9(){
	}
	public Example9(String name, int age, String state) {
		this.name = name;
		this.age = age;
		this.state = state;
	}
	
	public void display(){
		System.out.println("Example9 [name=" + name + ", age=" + age + ", state=" + state + "]");
	}
	

	public static void main(String[] args) {
		
		Example9 obj2 = new Example9();
		obj2.display();
		
		Example9 obj = new Example9("test", 23, "B");
		obj.display();
		
		Example9 obj1 = new Example9("test1", 24, "A");
		obj1.display();
	}
}
