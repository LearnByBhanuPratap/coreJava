package controlStatements;

public class ContinueExample2 {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if (i > 10) {
				System.out.println("Skipped by continue value is=" + i);
				continue;
			}
			System.out.println("value of i is=" + i);
		}
	}
	
	
	

}
