package controlStatements;

public class BreakExample1 {

	public static void main(String[] args) {
		int i = 0;
		while (i >= 0) {
			if (i == 10) {
				break;
			}
			//System.out.println("i counter="+i);
			i++;
			System.out.println("i counter="+i);
		}
	}
}
