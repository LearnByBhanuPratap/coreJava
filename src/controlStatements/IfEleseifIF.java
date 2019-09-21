package controlStatements;

public class IfEleseifIF {

	public void testAge(int age) {
		if (age > 18) {
			System.out.println("Person is Major");
		} else if(age < 5) {
			System.out.println("Person is Minor");
		}
		
		else if(age < 10) {
			System.out.println("Person is Minor");
		}
		
		
		else if(age < 11) {
			System.out.println("Person is Minor");
		}
		
		else{
			System.out.println("Invalid data");
		}
	}
	
	public static void main(String[] args) {
		IfEleseifIF obj = new IfEleseifIF();
		
		obj.testAge(20);
		
		obj.testAge(2);
		
		obj.testAge(6);
	}
}
