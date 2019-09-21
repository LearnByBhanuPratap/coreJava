package inheritance;

public class Jeep extends Vehicle{
	
	int price;

	String name;
	
	public Jeep(int price, String name) {
		this.price = price;
		this.name = name;
	}
	
	public static void main(String[] args) {
		Jeep jeep = new Jeep(1000,"Jeep");
		jeep.speed(100);
		System.out.println(jeep);
	}

	@Override
	public String toString() {
		return "Jeep [price=" + price + ", name=" + name + ", speed=" + speed + "]";
	}

}
