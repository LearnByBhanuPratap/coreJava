package inheritance;

public class Car extends Vehicle{
	
	int price;

	String name;
	
	public Car(int price, String name) {
		this.price = price;
		this.name = name;
	}

	public static void main(String[] args) {
		Car car = new Car(2000,"Maruti");
		car.speed(10);
		System.out.println(car);
	}

	@Override
	public String toString() {
		return "Car [price=" + price + ", name=" + name + ", speed=" + speed + "]";
	}
}
