package setClass;

import java.util.HashSet;

public class Example4 {
	
	public static void main(String[] args) {
		
		HashSet<Book> set = new HashSet<Book>();
		Book b1 = new Book(11, "Test1", "author1", "publisher1", 8);
		Book b2 = new Book(12, "Test2", "author2", "publisher2", 4);
		Book b3 = new Book(13, "Test3", "author3", "publisher3", 6);
		set.add(b1);
		set.add(b2);
		set.add(b3);
		for (Book book : set) {
			System.out.println(
					book.id + " " + book.name + " " + book.author + " " + book.publisher + " " + book.quantity);
		}
	}
}
