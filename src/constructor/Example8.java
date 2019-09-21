package constructor;

public class Example8 {
	
	Example8() {
		System.out.println("I am Example7()");
	}

	Example8(int i) {
		this();
		System.out.println("I am Example7(int i)");
	}

	Example8(int i, int j) {
		this(5);
		System.out.println("I am Example8(int i,int j) ");
	}

	public static void main(String[] args) {
		Example8 obj = new Example8(3,6);
	}
}
