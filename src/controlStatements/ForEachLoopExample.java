package controlStatements;

public class ForEachLoopExample {

	public static void main(String[] args) {
		int array[] = { 120, 230, 404, 560, 708 };
        
		
		System.out.println(array.length);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println("============");
		
		for (int i : array) {
			System.out.println(i);
		}
	}
}
