package testInheritance;

import inheritanceInJava.A;

public class TestInheritanceFromDifferentPackage extends A{
	
	public static void main(String[] args) {
		TestInheritanceFromDifferentPackage obj = new TestInheritanceFromDifferentPackage();
		obj.test1();
		obj.test3();
		
		System.out.println(obj.i);
		System.out.println(obj.k);
	}

}
