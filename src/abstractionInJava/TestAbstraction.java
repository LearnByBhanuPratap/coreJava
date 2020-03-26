package abstractionInJava;

public class TestAbstraction {
	
	public static void main(String[] args) {
		
		Employee obj = new Contractor("Test1", 300, 4);
		
		System.out.println("Contractor Salary "+obj.calculateSalary());
		
		Employee obj1 = new FullTimeEmployee("Test1", 500);
		
		System.out.println("FillTime Salary "+obj1.calculateSalary());
	}

}
