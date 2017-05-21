package collectionFramewrokInJava;

import java.util.List;
import java.util.Vector;

public class VectorInJava2 {

	public static void main(String[] args) {


		List<Object> vector1 = new Vector<Object>();

		vector1.add(Integer.valueOf(10));
		vector1.add(20);
		vector1.add(30);
		vector1.add(true);
		vector1.add(String.valueOf("50"));
		vector1.add("50");
		vector1.add(50.0);
		vector1.add(50.0);
		vector1.add(50.0);

		System.out.println(vector1);

		List<Double> vector2 = new Vector<Double>();

		vector2.add(Double.valueOf(10));
		vector2.add(20.98);
		vector2.add(Double.valueOf(30));
		vector2.add(7.98);
		vector2.add(2.56);
		vector2.add(50.0);
		
	    //System.out.println(vector1.size());
	   // System.out.println(vector1.isEmpty());
	   // vector1.clear();
	   // System.out.println(vector1);
	   // System.out.println(vector1.isEmpty());
		
		//vector1.addAll(vector2);
		//vector1.add(2, 900000);
		
		//vector1.removeAll(vector2);
		vector1.retainAll(vector2);
		System.out.println(vector1);
	}

}
