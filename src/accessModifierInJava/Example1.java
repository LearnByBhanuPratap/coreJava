package accessModifierInJava;

public class Example1 {

	public int i;
	protected int k;
	private int p;
	int d;

	public void test1() {
      System.out.println("public void test1()");
	}

	protected void test2() {
		System.out.println("protected void test2()");
	}

	 void test3() {
		System.out.println("void test3()");
	}

	private void test4() {
		System.out.println("private void test4()");
	}
	
	public static void main(String[] args) {
		Example1 obj = new Example1();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		
		System.out.println(obj.i);
		System.out.println(obj.k);
		System.out.println(obj.p);
		System.out.println(obj.d);
	}

}
