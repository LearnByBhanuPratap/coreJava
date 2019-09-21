package ThisExample;

public class Example1 {
	int rollno;
	String name;
	float fee;

	Example1(int rollno, String name, float fee) {
		rollno = rollno;
		name = name;
		fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}

	public static void main(String args[]) {
		Example1 s1 = new Example1(111, "ankit", 5000f);
		Example1 s2 = new Example1(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}