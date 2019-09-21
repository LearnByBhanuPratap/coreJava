package constructor;

public class Example1 {
	
	public String name;
	public int i = 90;

	Example1() {
		System.out.println("======");
	}
	
	public static void main(String[] args) {
		Example1 obj = new Example1();
		Example1 obj2 = new Example1();
		Example1 obj3 = new Example1();
		Example1 obj4 = new Example1();
		System.out.println(obj.name);
		System.out.println(obj.i);
	}
}
