
package encapsulationInJava;

public class Coffee {

	private CoffeeSelection selection;
	private double quantity;

	public Coffee(CoffeeSelection selection, double quantity) {
		this.selection = selection;
		this.quantity = quantity;
	}

	public CoffeeSelection getSelection() {
		return selection;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) throws Exception {
		if (quantity >= 0.0) {
			this.quantity = quantity;
		} else {
			throw new Exception("Quantity has to be >= 0.0.");
		}
	}
}