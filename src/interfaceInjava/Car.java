package interfaceInjava;

public class Car implements Vehicle {

	int speed;
	int gear;

	@Override
	public void changeGear(int a) {
		gear = a;
	}

	@Override
	public void speedUp(int a) {

		speed = a;
	}

	@Override
	public void applyBrakes(int a) {

		speed = speed - a;
	}

	public void display() {
		System.out.println("speed: " + speed + " gear: " + gear);
	}
}
