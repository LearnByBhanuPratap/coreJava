package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Example8 {
	
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(10, "Amit", "DS"));
		list.add(new Student(11, "Mohan", "AS"));
		list.add(new Student(12, "Ram", "GS"));
		list.add(new Student(13, "Suresh", "KS"));
		list.add(new Student(14, "Bhanu", "DK"));
		
		System.out.println(list);
	}

}
