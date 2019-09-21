package ThisExample;

public class Example2 {
	int rollno;
	String name;
	float fee;

	Example2(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}

	public static void main(String args[]) {
		Example2 s1 = new Example2(111, "ankit", 5000f);
		Example2 s2 = new Example2(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}
