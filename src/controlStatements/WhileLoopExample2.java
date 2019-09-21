package controlStatements;

public class WhileLoopExample2 {

	public static void main(String[] args) {
		
		final double danger_rate = 2;
		
		int a = 2;
		
		int minute;
		minute = 0;
		double total_danger = 0;
		while (total_danger <= 1) {
			total_danger = danger_rate * minute;
			minute++;
		}

		System.out.println("danger hits 100% after " + minute + " minutes");
	}
}
