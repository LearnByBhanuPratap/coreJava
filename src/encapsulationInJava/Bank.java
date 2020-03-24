package encapsulationInJava;

public abstract class Bank {
	private int accno;
	private String name;
	private int loan;
	private int balance;

	void display_to_clerk() {
		System.out.println("Accno = " + accno);
		System.out.println("Name = " + name);
	}

	void display_to_manager() {
		System.out.println("Accno = " + accno);
		System.out.println("Name = " + name);
		System.out.println("Loan = " + loan);
		System.out.println("Balance = " + balance);
	}
}