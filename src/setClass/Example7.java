package setClass;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Example7 {

	public static void main(String[] args) {

		TreeSet<Integer> obj = new TreeSet<Integer>();

		obj.add(900);
		obj.add(9);
		obj.add(5);
		obj.add(90);
		obj.add(30);
		obj.add(10);
		obj.add(100);
		obj.add(80);
		obj.add(1);

		System.out.println(obj);
		System.out.println("------------------");
		System.out.println("obj.pollFirst()=" + obj.pollFirst());

		System.out.println("obj.pollLast()=" + obj.pollLast());

		System.out.println(obj);

		System.out.println("obj.ceiling(900)=" + obj.ceiling(900));
		System.out.println("obj.ceiling(90)=" + obj.ceiling(90));
		System.out.println(obj);

		System.out.println("===headSet out by default inclusive=false ===");

		SortedSet<Integer> headSet = obj.headSet(80);
		for (Integer integer : headSet) {
			System.out.println(integer);
		}

		System.out.println("headSet inclusive=true");

		headSet = obj.headSet(80, true);

		for (Integer integer : headSet) {
			System.out.println(integer);
		}

		System.out.println("obj.higher(5)=" + obj.higher(5));

		System.out.println("obj.lower(30)=" + obj.lower(30));

		System.out.println("====tailSet output by default inclusive=true ===");
		SortedSet<Integer> tailSet = obj.tailSet(80);
		for (Integer integer : tailSet) {
			System.out.println(integer);
		}

		System.out.println("====tailSet output inclusive=false ===");
		tailSet = obj.tailSet(80, false);
		for (Integer integer : tailSet) {
			System.out.println(integer);
		}

		Object[] array = obj.toArray();
		System.out.println(Arrays.deepToString(array));
	}

}
