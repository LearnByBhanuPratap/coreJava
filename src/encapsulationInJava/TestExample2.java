package encapsulationInJava;

public class TestExample2 {
	
	public static void main(String[] args) {
		Example2 obj = new Example2();
		obj.setAge("100");
		obj.setName("Test");
		
		
		System.out.println("name="+obj.getName()+" age="+obj.getAge());
	}
}
