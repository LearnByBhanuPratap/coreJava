package controlStatements;

public class WhileExam {

	public static void main(String[] args) {
		int myNumber = 1;
		
		while (myNumber != 1000) {
			
			if ((myNumber % 2) == 0) {
				System.out.println(myNumber + " is even");
			}
			
			myNumber++;
		}
	}
}
