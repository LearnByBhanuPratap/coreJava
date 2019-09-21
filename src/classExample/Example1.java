package classExample;

public class Example1 extends Object{
	
	int age;
	static final int MAX_AGE = 18;
	 
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void setAge1(int age) {

	}

	
	public static void main(String... xyx) {
		Example1 obj1 = new Example1();
	
		obj1.setAge(4);
		obj1.getAge();

		System.out.println(obj1.getAge());
		Example1 obj2 = new Example1();
		
		System.out.println(obj2.getAge());
		
		obj2.setAge(6);
		obj2.getAge();
		System.out.println(obj2.getAge());
		
		Example1.setAge1(4);

		
	}
	
}