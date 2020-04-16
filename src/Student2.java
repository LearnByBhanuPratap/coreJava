import java.util.ArrayList;
import java.util.Collections;

public class Student2 implements Comparable<Student2> {
	int rollno;
	String name;
	int age;

	Student2(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student2 st) {
		return name.compareTo(st.name);
	}
	
	public static void main(String[] args) {
		
		ArrayList<Student2> al = new ArrayList<Student2>();
		
		al.add(new Student2(101, "BB", 23));
		al.add(new Student2(102, "CC", 20));
		al.add(new Student2(109, "AA", 22));

		Collections.sort(al);
		
		for (Student2 st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}