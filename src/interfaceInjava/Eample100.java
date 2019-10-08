package interfaceInjava;

public class Eample100 implements Example101 {

	@Override
	public void test1() {

	}

	public void test5() {

	}

	public static void main(String[] args) {
		Example101 obj = new Eample100();

		obj.test1();
		obj.test2();
		obj.test3();

		Example102 obj1 = new Eample100();
		obj1.test3();

		Eample100 obj2 = new Eample100();
		obj2.test5();

	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub

	}

}
