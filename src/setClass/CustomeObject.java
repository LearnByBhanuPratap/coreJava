package setClass;

public class CustomeObject implements Cloneable {

	private int i;
	private Emplyee emplyee;

	public CustomeObject(int i, Emplyee emplyee) {
		super();
		this.i = i;
		this.emplyee = emplyee;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public Emplyee getEmplyee() {
		return emplyee;
	}

	public void setEmplyee(Emplyee emplyee) {
		this.emplyee = emplyee;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		CustomeObject customeobject = (CustomeObject) super.clone();
		Emplyee emp = (Emplyee) customeobject.getEmplyee().clone();
		customeobject.setEmplyee(emp);
		return customeobject;
	}

	@Override
	public String toString() {
		return "Customeobject [i=" + i + ", emplyee=" + emplyee + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		CustomeObject originalObject = new CustomeObject(1, new Emplyee("Test", 40));

		CustomeObject clonedObject = (CustomeObject) originalObject.clone();

		System.out.println(originalObject);
		System.out.println(clonedObject);

		clonedObject.getEmplyee().setName("Changed");

		System.out.println(originalObject);
		System.out.println(clonedObject);
		
		originalObject.getEmplyee().setName("original");

		System.out.println(originalObject);
		System.out.println(clonedObject);

	}

}

class Emplyee implements Cloneable {

	private String name;
	private int age;

	public Emplyee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (Emplyee) super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Emplyee [name=" + name + ", age=" + age + "]";
	}

}
