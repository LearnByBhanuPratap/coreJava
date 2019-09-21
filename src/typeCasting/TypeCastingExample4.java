package typeCasting;

public class TypeCastingExample4 {

	public static void main(String args[]) {
		byte b = 47;
		char c = 'b';
		short s = 1026;
		int i = 80000;
		float f = 8.67f;
		double d = .923;

		double result = (f * b) + (i / c) - (d * s);

		System.out.println("result = " + result);
	}
}
