package wrapperClassInjava;

public class Example1 {
	
	public static void main(String[] args) {

		int i = 10;
		String s40 = "100";
		
		Integer integer1 = new Integer(i);
		Integer integer2 = new Integer(s40);
		//Integer integer3 = new Integer("Test");

		System.out.println(integer1.compareTo(integer2));
		System.out.println(integer1.doubleValue());
		System.out.println(integer1.intValue());
		System.out.println(integer1.longValue());
		System.out.println(integer1.shortValue());
		System.out.println(integer1.byteValue());
		System.out.println("====================");
		System.out.println(integer1.compareTo(integer2));
		double data = integer2.doubleValue();
		long dat1 = integer2.longValue();
		System.out.println(integer2.doubleValue());
		System.out.println(integer2.intValue());
		System.out.println(integer2.longValue());
		System.out.println("====================");

		/**
		 * @return the integer value represented by the argument in decimal.@exception
		 *         NumberFormatException if the string does not contain aparsable
		 *         integer.
		 */
		int s2 = Integer.parseInt(s40);
		System.out.println(s2);
		//Integer.parseInt(1000);
		
		/**
		 * Both valueOf and parseInt methods are used to convert String to Integer in Java, 
		 * but there are subtle difference between them. ... valueOf() of java. lang. 
		 * Integer returns an Integer object, while parseInt() method returns an int primitive
		 */
		Integer s3 = Integer.valueOf("1000", 4);
		System.out.println(s3);
		Integer s4 = Integer.valueOf(s40);
		System.out.println(s4);
		Integer.valueOf("1000");

	}

}
