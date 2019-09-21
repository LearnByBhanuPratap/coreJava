package constructor;

public class Example7 {

	Example7() {
		this(90,10);
		System.out.println("I am Example7()");
	}

	Example7(int i) {
		this();
		System.out.println("I am Example7(int i)");
	}
	
	Example7(int i, int b){
		System.out.println("(int i, int b)");
	}

	public static void main(String[] args) {
		
		Example7 obj = new Example7(3);
	}
}
