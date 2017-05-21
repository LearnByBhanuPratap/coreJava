package collectionFramewrokInJava;

import java.util.List;
import java.util.Vector;

public class VectorInJava {

	public static void main(String[] args) {
		List vector = new Vector<>();

		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(true);
		vector.add("50");
		vector.add("50");

		System.out.println(vector);

		List<Object> vector1 = new Vector<Object>();

		vector1.add(Integer.valueOf(10));
		vector1.add(20);
		vector1.add(30);
		vector1.add(true);
		vector1.add(String.valueOf("50"));
		vector1.add("50");

		System.out.println(vector1);

		List<Double> vector2 = new Vector<Double>();

		vector2.add(Double.valueOf(10));
		vector2.add(20.98);
		vector2.add(Double.valueOf(30));
		vector2.add(7.98);
		vector2.add(2.56);
		vector2.add(9.897);
		
		System.out.println(vector2);
		
		Vector<Double> vector3 = new Vector<Double>();

		vector3.add(Double.valueOf(10));
		vector3.add(20.98);
		vector3.add(Double.valueOf(30));
		vector3.add(7.98);
		vector3.add(2.56);
		vector3.add(9.897);
		
		System.out.println(vector3);
	}

}
