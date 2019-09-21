package encapsulationInJava;

public class TestExample3 {
	
	public static void main(String[] args) throws Exception {
		Example3 obj = new Example3();
		obj.setAge(11);
		System.out.println(obj.getAge());
		
		obj.setAge(9);
		System.out.println(obj.getAge());
	}

}
