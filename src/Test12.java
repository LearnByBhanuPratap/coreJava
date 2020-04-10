import java.util.ArrayList;

public class Test12 {

	public static void main(String[] args) {

		boolean a = true;
		boolean b = true;

		if (a != b) {
			System.out.println("tset");
		}

		ArrayList<String> arrlist = new ArrayList<String>();

		// adding element to arrlist
		arrlist.add("A");
		arrlist.add("B");
		arrlist.add("C");
		arrlist.add("D");
		
		arrlist.ensureCapacity(2);
		
		System.out.println(arrlist));
	}

}
