package wrapperClassInjava;

public class Ecample2 {
	public static void main(String[] args) {
		
		String s1;
		
		Double double1 = new Double(0.0/0.0);
		System.out.println(double1.isNaN());
		double1.intValue();
		double1.byteValue();
		double1.shortValue();
		
		Double double2 = new Double(1.0/0.0);
		System.out.println(double2.isNaN());

		Boolean boolean1 = new Boolean(true);
		Boolean boolean2 = new Boolean("test");

		System.out.println(boolean1.compareTo(boolean2));
		System.out.println(boolean1.booleanValue());
		
		System.out.println(Boolean.parseBoolean("true"));
		
		System.out.println(Boolean.parseBoolean("CDA"));
		
	
	}
}
