package wrapperClassInjava;

public class Snippet {
	public static void main(String args[]) {
		// Binary to decimal conversion
		System.out.println(Long.parseLong("101010", 2));

		// Octal to decimal conversion
		int data = Integer.parseInt("463", 8);
		System.out.println(Byte.parseByte("463", 8));

		// Hexadecimal to decimal conversion
		System.out.println(Long.parseLong("4AC", 16));

		// String to decimal conversion - throughs NumberFormat Exception, Because it
		// contains D
		System.out.println(Integer.parseInt("6BDC", 13));
		
		
		System.out.println(Byte.valueOf("101010", 2));

		// Octal to decimal conversion
		int data1 = Integer.valueOf("463", 8);
		System.out.println(Long.valueOf("463", 8));

		// Hexadecimal to decimal conversion
		System.out.println(Integer.valueOf("4AC", 16));

		

	}

}
