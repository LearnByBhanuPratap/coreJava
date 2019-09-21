package inheritanceInJava;

public class B extends A{
	
	public static void main(String[] args) {
		B obj = new B();
		obj.test1();
		obj.test3();
		obj.test4();
		
		System.out.println(obj.i);
		System.out.println(obj.k);
		System.out.println(obj.p);
	}

}
