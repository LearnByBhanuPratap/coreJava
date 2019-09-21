package controlStatements;

public class ContinueExample1 {

	public static void main(String[] args) {

		int array[] = { 120, 230, 404, 560, 708, 90, 10, 20 };

		for (int i = 0; i < array.length; i++) {

			System.out.println("number is=" + array[i]);
			System.out.println("number is=" + array[i]);
			System.out.println("number is=" + array[i]);
			System.out.println("number is=" + array[i]);
			
			if (array[i] < 560) {
				continue;
			}
			
			System.out.println("number is=" + array[i]);
			System.out.println("number is=" + array[i]);
			System.out.println("number is=" + array[i]);
			System.out.println("number is=" + array[i]);
		}
	}
}
