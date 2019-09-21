package instanceOfInJava;

public class Dog extends Animal {

	public static void main(String args[]) {
		Dog d = new Dog();
		System.out.println(d instanceof Animal);
	}
}
