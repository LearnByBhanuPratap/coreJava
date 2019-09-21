package ThisExample;

public class Example5 {
	
	void m(Example5 obj) {
		System.out.println("method is invoked");
	}

	void p() {
		m(this);
	}

	public static void main(String args[]) {
		Example5 s1 = new Example5();
		s1.p();
	}
}
