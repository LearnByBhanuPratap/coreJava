package enumjava;

public class TestOperation {
	
	public static void main(String[] args) {

		double result = Operation.PLUS.calculate(1, 3);
		
		System.out.println(result);
		
		result = Operation.MINUS.calculate(1, 3);
		System.out.println(result);
	}
}
