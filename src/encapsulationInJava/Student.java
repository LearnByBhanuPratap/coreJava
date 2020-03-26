package encapsulationInJava;

public class Student {

	private long id; // Here, No encapsulation is used. Since the field is not
				// private.

	public String getId() {
		return String.valueOf(id);
	}

	public void setId(String id) {
		this.id = Long.parseLong(id);
	}
}
