package BasicOfJava;

public class ClassObjectAndMethod {
	
	public int hight;
	public int weight;
	public String color;
	
	public void walk(){
		System.out.println("walk()");
	}
	
	public void eat(int i){
		System.out.println(i);
	}
	
	public void run(){
		System.out.println("run()");	
	}
	
	public static void main(String[] args) {
		ClassObjectAndMethod obj = new ClassObjectAndMethod();
		obj.walk();
		obj.run();
		obj.eat(5);
		System.out.println(obj.hight);
		ClassObjectAndMethod obj1 = new ClassObjectAndMethod();
		obj1.eat(4);
		ClassObjectAndMethod obj2 = new ClassObjectAndMethod();
		obj2.walk();
	}

	  

}
