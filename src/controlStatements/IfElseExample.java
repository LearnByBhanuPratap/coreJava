package controlStatements;

public class IfElseExample {
	
	static boolean condition;

	public static void main(String[] args) {
		System.out.println(condition);
		if (condition) {
			System.out.println("IN IF PART");
		} else {
			System.out.println("In ELSE PART");
		}
	}
}
