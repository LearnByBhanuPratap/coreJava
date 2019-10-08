package staticBlock;

public class Example2 {

	static int i = 10;
	static int j;
	
	int k;

	static {
		System.out.println("Static block initialized.");
		j = i * 2;
	}
	
	Example2(){
		k = 30;
	}

	public static void main(String[] args) {
		Example2 onj = new Example2();
		System.out.println("Value of i : " + Example2.i);
		System.out.println("Value of j : " + Example2.j);
		System.out.println("Value of k : " + onj.k);
	}
}
