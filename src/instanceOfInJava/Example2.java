package instanceOfInJava;

public class Example2 extends Example1 {

	public static void main(String[] args) {
		Example2 obj = new Example2();

		if (obj instanceof Example1) {
			System.out.println("Obj instanceof Example1");
		} else {
			System.out.println("Obj NOT instanceof Example1");
		}

		if (obj instanceof Example2) {
			System.out.println("Obj instanceof Example2");
		} else {
			System.out.println("Obj NOT instanceof Example2");
		}

		if (obj instanceof Object) {
			System.out.println("Obj instanceof Object");
		} else {
			System.out.println("Obj NOT instanceof Object");
		}

		Example1 obj1 = new Example1();

		if (obj1 instanceof Example1) {
			System.out.println("Obj instanceof Example1");
		} else {
			System.out.println("Obj NOT instanceof Example1");
		}

		if (obj1 instanceof Example2) {
			System.out.println("Obj instanceof Example2");
		} else {
			System.out.println("Obj NOT instanceof Example2");
		}

		if (obj1 instanceof Object) {
			System.out.println("Obj instanceof Object");
		} else {
			System.out.println("Obj NOT instanceof Object");
		}
	}

}
