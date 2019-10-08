package interfaceInjava;

public class B1Test implements B1, Example7{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		B1Test obj = new B1Test();
		obj.test1();
		
	}

	@Override
	public void method5() {
		
		Example7.test2();
		
	}

	@Override
	public void method6() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tset56() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Example7.test2();
	}

}
