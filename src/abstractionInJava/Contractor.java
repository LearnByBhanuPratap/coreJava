package abstractionInJava;

public class Contractor extends Employee {

	private int workingHours;

	public Contractor(String name, int paymentPerHour, int workingHours) {
		super(name, paymentPerHour);
		this.workingHours = workingHours;
	}

	@Override
	public int calculateSalary() {
		return getPaymentPerHour() * workingHours;
	}

}
