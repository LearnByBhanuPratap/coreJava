package RuntimePolymorphism;

public class TestPolym {

	public static void main(String[] args) {
		Animal a  = new Dog();
		a.eat();
		
		a = new Cat();
		a.eat();
		
		a = new Lion();
		a.eat();
	}
}
