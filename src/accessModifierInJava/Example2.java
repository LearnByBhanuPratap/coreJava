package accessModifierInJava;

public class Example2 {
	
	public static void main(String[] args) {
		
		Example1 obj = new Example1();
		obj.test1();
		obj.test2();
		obj.test3();
		//obj.test4();
		
		System.out.println(obj.i);
		System.out.println(obj.k);
		//System.out.println(obj.p);
		System.out.println(obj.d);
	}

}
