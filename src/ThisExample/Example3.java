package ThisExample;

public class Example3 {

	void display() {
		this.show();

		System.out.println("Inside display function");
	}

	void show() {
		System.out.println("Inside show funcion");
	}

	public static void main(String args[]) {
		Example3 t1 = new Example3();
		t1.display();
	}
}