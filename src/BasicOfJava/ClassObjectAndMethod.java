package BasicOfJava;

public class ClassObjectAndMethod {
	
	int hight;
	int weight;
	String color;
	
	public void walk(){
		System.out.println("walk()");
	}
	
	public  void run(){
		System.out.println("run()");	
	}
	
	public static void main(String[] args) {
		ClassObjectAndMethod obj = new ClassObjectAndMethod();
		obj.walk();
		obj.run();
		System.out.println(obj.hight);
		ClassObjectAndMethod obj1 = new ClassObjectAndMethod();
		obj1.walk();
		ClassObjectAndMethod obj2 = new ClassObjectAndMethod();
		obj2.run();
	}

}
