package encapsulationInJava;

import java.util.List;

public class TestTestExample6 {

	public static void main(String[] args) {
		
		TestExample6 example6 = new TestExample6();
		
		System.out.println(example6.getBooks());
		
		List<String> data = example6.getBooks();
		
		data.remove(1);
		
		System.out.println(example6.getBooks());
		
		List<String> data1 = example6.getBooks();
		data1.remove(0);
		data1 = null;
		System.out.println(example6.getBooks());
	}

}
