import java.util.ArrayList;

public class ArrayListClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		ArrayList<Integer> li = new ArrayList<Integer>();
		
		li.add(Integer.valueOf(2));
		li.add(3);
		li.add(4);
		
		System.out.println(li);
		ArrayList<Integer> li1 = (ArrayList<Integer>)li.clone();
		System.out.println(li1);
		
		li1.remove(0);

		System.out.println(li);
		System.out.println(li1);

		System.out.println(li.hashCode());
		System.out.println(li1.hashCode());
		
		System.out.println("------------------");

		ArrayList<Person> original = new ArrayList<Person>();
		original.add(new Person("RAM"));
		
		ArrayList<Person> cloned = new ArrayList<Person>();
		for (int i = 0; i < original.size(); i++) {
			cloned.add((Person)original.get(i).clone());
		}

		System.out.println("origin person object hashCode==" + original.hashCode());
		System.out.println("cloned person object hashCode==" + cloned.hashCode());

		System.out.println("===After cloning====");
		
		System.out.println(original.get(0).getName());
		System.out.println(cloned.get(0).getName());

		original.get(0).setName("MOHAN");
		System.out.println("===Modified Name through original object====");
		System.out.println(original.get(0).getName());
		System.out.println(cloned.get(0).getName());

		cloned.get(0).setName("SOHAN");
		System.out.println("===Modified Name through cloned object====");
		System.out.println(original.get(0).getName());
		System.out.println(cloned.get(0).getName());
	}

}
