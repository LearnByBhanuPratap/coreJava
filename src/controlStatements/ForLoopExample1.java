package controlStatements;

public class ForLoopExample1 {

	public static void main(String[] args) {
		
		int array[] = { 120, 230, 404, 560, 708 };
		
        int a[] = new int[4];
        a[0] = 10;
        a[1] = 10;
        a[2] = 10;
        a[3] = 10;
        
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
