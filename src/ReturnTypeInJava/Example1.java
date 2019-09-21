package returnTypeInJava;

public class Example1 {
	
	public void test1(){
		System.out.println("void test1()");
	}
	
	public int test2(){
		System.out.println("int test2()");
		return 2;
	}
	
	public double test3(){
		System.out.println("int test2()");
		return 9.899;
	}
	
	public boolean test4(){
		System.out.println("int test2()");
		return true;
	}
	
	public char test5(){
		System.out.println("int test2()");
		return 'c';
	}
	
	public String test6(){
		System.out.println("int test2()");
		return "c";
	}
	
	public int[] test7(){
		System.out.println("int test2()");
		return new int[3];
	}
	
	public int[][] test8(){
		System.out.println("int test2()");
		return new int[3][6];
	}
	
	public Example1 test9(){
		System.out.println("int test2()");
		return new Example1();
	}
	
	public static void main(String[] args) {
		int[] a = new int[3];
		int[][] b = new int[3][6];
		
		Example1 obj = new Example1();
	}


}
