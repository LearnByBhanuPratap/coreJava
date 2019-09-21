package constructor;

public class Test2 extends Test1 {

	Test2() {
		super(8,9);	
	}

	Test2(int i, int j) {
		super(i,j);
	}

	public static void main(String[] args) {
		Test2 obj = new Test2();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		Test2 obj1 = new Test2(80,90);
		System.out.println(obj1.a);
		System.out.println(obj1.b);
	}

}
