package arrayList;

public class Test1 implements Cloneable {

	private int age = 10;
	private Department department;

	public Test1(int age, Department department) {
		this.age = age;
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (Test1) super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Test1 original = new Test1(10, new Department(10, "tes43344"));
		Test1 cloned = (Test1) original.clone();

		System.out.println(original.hashCode());
		System.out.println(cloned.hashCode());

		System.out.println("original age=" + original.getAge());
		System.out.println("cloned age=" + cloned.getAge());

		cloned.setAge(20);

		System.out.println("original age=" + original.getAge());
		System.out.println("cloned age=" + cloned.getAge());

		original.setAge(30);

		System.out.println("original age=" + original.getAge());
		System.out.println("cloned age=" + cloned.getAge());
	}

}
