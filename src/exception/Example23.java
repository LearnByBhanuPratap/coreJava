package exception;

import java.io.FileNotFoundException;

public class Example23 {

	void method() throws ArithmeticException {
		throw new ArithmeticException("ArithmeticException Occurred");
	}
	
	public static void main(String[] args) {
		Example26 obj = new Example26();
		try {
			obj.test1();
		} catch ( NullPointerException e ) {
			
			e.printStackTrace();
		}
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
