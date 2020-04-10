package exception;

import java.io.FileNotFoundException;

public class Example26 {
	
	void test1() throws FileNotFoundException, NullPointerException,InterruptedException, Exception {
		try {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			throw new Exception();
		} catch (Exception e) {
			throw e;
		}
	}
	
	

}
