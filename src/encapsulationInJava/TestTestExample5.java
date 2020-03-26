package encapsulationInJava;

import java.util.Arrays;

public class TestTestExample5 {
	
	public static void main(String[] args) {
		
		TestExample5 example5 = new TestExample5();
		int[] data = example5.getA();
		
		System.out.println(Arrays.toString(example5.getA()));
		data[2] = 0;
		//System.out.println(example5.getA());
		System.out.println(Arrays.toString(example5.getA()));

		//TestExample5 example6 = new TestExample5();
		//int[] data1 = example5.getA().clone();
		//data1[2] = 0;
		//System.out.println(Arrays.toString(example6.getA()));
	}

}
