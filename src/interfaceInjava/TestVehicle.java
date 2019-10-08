package interfaceInjava;

public class TestVehicle {

	public static void main(String[] args) {

		Car car = new Car();
		car.changeGear(3);
		car.speedUp(4);
		car.applyBrakes(1);

		System.out.println("Car present state :");
		car.display();

		Bike bike = new Bike();
		bike.changeGear(2);
		bike.speedUp(4);
		bike.applyBrakes(1);

		System.out.println("Bike present state :");
		bike.display();
	}

}
