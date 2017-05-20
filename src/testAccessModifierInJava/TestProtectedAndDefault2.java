package testAccessModifierInJava;

import accessModifierInJava.Example1;

public class TestProtectedAndDefault2{
	
	public static void main(String[] args) {
		
		TestProtectedAndDefault2 obj = new TestProtectedAndDefault2();
		
		
		Example1 obj1 = new Example1();
		obj1.test1();
		
		System.out.println(obj1.i);
	}

}
