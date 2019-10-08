package methodOverloading;

public class Overloading2 {

	public static void display(int a) {
		System.out.println("Got Integer data.");
	}

	public static void display(String a) {
		System.out.println("Got String object.");
	}

	public static void main(String[] args) {
		display(1);
		display("Hello");
	}
}
