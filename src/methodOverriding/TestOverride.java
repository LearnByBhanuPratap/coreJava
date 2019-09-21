package methodOverriding;

public class TestOverride {

	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		
		Jeep jeep = new Jeep();
		jeep.run();

		Bike bike = new Bike();
		bike.run();
	}

}
