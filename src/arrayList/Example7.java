package arrayList;

import java.util.Date;

public class Example7 implements Cloneable {
	private Long id;
	private String name;
	private Date dob; // Mutable field

	public Example7(Long id, String name, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		Example7 clone = null;
		try {
			clone = (Example7) super.clone();
			// Copy new date object to cloned method
			clone.setDob((Date) this.getDob().clone());
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
		return clone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}
}
