package encapsulationInJava;

import java.util.ArrayList;
import java.util.List;

public class TestExample6 {

	private List<String> books;

	public TestExample6() {
		this.books = new ArrayList<String>();
		books.add("Test1");
		books.add("Test2");
		books.add("Test3");
	}

	public List<String> getBooks() {
		return new ArrayList<String>(books);
		//return books;
	}

	public void setBooks(List<String> books) {
		this.books = books;
	}

}
