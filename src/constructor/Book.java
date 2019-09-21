package constructor;

public class Book {

	int length;
	int breadth;
	int height=90;

	public Book(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	Book(){
		
	}

	public static void main(String[] args) {
		Book obj = new Book(10, 20, 30);
		System.out.println(obj.length);
		Book obj1 = new Book(20, 200, 300);
		Book obj2 = new Book(101, 201, 301);
		System.out.println(obj.length);
		
		Book ob = new Book();
		System.out.println(ob.length);
	}
}
