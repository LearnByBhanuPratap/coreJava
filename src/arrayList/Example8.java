package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example8 {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student(10, "Amit", "DS", new Address("Muzaffarpur Bihar")));
		list.add(new Student(11, "Mohan", "AS", new Address("Muzaffarpur Bihar")));
		list.add(new Student(12, "Ram", "GS", new Address("Muzaffarpur Bihar")));
		list.add(new Student(13, "Suresh", "KS", new Address("Muzaffarpur Bihar")));
		list.add(new Student(14, "Bhanu", "DK", new Address("Muzaffarpur Bihar")));
		Student student5 = new Student(14, "Bhanu10", "DK", new Address("Muzaffarpur Bihar"));
		list.add(student5);

		System.out.println(list);

		System.out.println(list.get(0));
		Student data = list.get(0);

		Iterator<Student> itr = list.iterator();
		while (itr.hasNext()) {
			Student student = itr.next();
			System.out.println("age=" + student.getAge() + " name=" + student.getName() + " address="
					+ student.getAddress().getAddress());
		}

	}

}
