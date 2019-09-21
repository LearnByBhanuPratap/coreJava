package access.modifier.test;

import accessmodifier.Example1;

public class Example4 extends Example1{
	
	public static void main(String[] args) {
		Example4 example4 = new Example4();
		example4.name1();
		example4.name2();
		
		System.out.println(example4.s1);
		System.out.println(example4.s3);
	}

}
