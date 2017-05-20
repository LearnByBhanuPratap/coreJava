package testAccessModifierInJava;

import accessModifierInJava.Example1;

public class TestProtectedAndDefault extends Example1{
	
	public static void main(String[] args) {
		
		TestProtectedAndDefault obj = new TestProtectedAndDefault();
		obj.test1();
		obj.test2();
		
		Example1 obj1 = new Example1();
		obj1.test1();
		System.out.println(obj1.i);
		
	}

}
