package constructor;

public class Example4 {

	private Example4(){
		System.out.println("default");
	}
	
	public static void main(String[] args) {
		Example4 obj = new Example4();
	}
}
