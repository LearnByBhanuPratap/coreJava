package BasicOfJava;

public class StaticAndNonStaticInJava1 {
	
	public static void main(String[] args) {
		
		StaticAndNonStaticInJava obj = new StaticAndNonStaticInJava();
		obj.test1();
		obj.test3();
		
		StaticAndNonStaticInJava.test2();
		StaticAndNonStaticInJava.test4();
		
		StaticAndNonStaticInJava obj1 = new StaticAndNonStaticInJava();
		
		obj1.test1();
		obj1.test3();
		
       StaticAndNonStaticInJava obj3 = new StaticAndNonStaticInJava();
		
		obj3.test1();
		obj3.test3();
		
		StaticAndNonStaticInJava.test2();
		StaticAndNonStaticInJava.test4();
		
		StaticAndNonStaticInJava.test2();
		StaticAndNonStaticInJava.test4();
	}

}
