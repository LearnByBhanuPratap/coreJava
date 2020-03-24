package staticAndDynamicBinding;

class Human {
	public static void walk() {
		System.out.println("Human walks");
	}
}

class Boy extends Human {
	public static void walk() {
		System.out.println("Boy walks");
	}

	public static void main(String args[]) {
		Human obj = new Boy();
		Human obj2 = new Human();
		obj.walk();
		obj2.walk();
	}
}