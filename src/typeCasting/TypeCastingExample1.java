package typeCasting;

public class TypeCastingExample1 {

	public static void main(String[] args) {
		int i = 200;

		long l = i;

		float f = l;
		
		double d = i;
		
		System.out.println("Int value " + i);
		System.out.println("Long value " + l);
		System.out.println("Float value " + f);
		System.out.println("Double value " + d);
	}
}
