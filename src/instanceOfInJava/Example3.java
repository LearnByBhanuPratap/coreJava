package instanceOfInJava;

public class Example3 {
	static int i = 0;
	static boolean b = false;
	static double d = 9.0;
	static char c = 'v';
	static float f = 9.0f;

	public static void main(String[] args) {

		// As the name suggests, instanceof means an instance (object) of a class.
		// Primitive data types are not instances.
		//if (i instanceof Integer) {

		//}

		if(Integer.class.isInstance(b)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		if(Boolean.class.isInstance(b)) {
			System.out.println("True");
		}
		if(Double.class.isInstance(d)) {
			System.out.println("True");
		}
		if(Character.class.isInstance(c)) {
			System.out.println("True");
		}
	}

}
