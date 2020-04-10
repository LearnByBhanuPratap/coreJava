
public class OnlyPrimitive implements Cloneable {

	private int i;

	private int j;

	public OnlyPrimitive(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (OnlyPrimitive) super.clone();
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		OnlyPrimitive onlyPrimitive = new OnlyPrimitive(2, 3);
		OnlyPrimitive cloned = (OnlyPrimitive) onlyPrimitive.clone();

		System.out.println(onlyPrimitive.hashCode());
		System.out.println(cloned.hashCode());

		System.out.println(onlyPrimitive.getI());
		System.out.println(cloned.getI());

		onlyPrimitive.setI(8);
		System.out.println(onlyPrimitive.getI());
		System.out.println(cloned.getI());

		cloned.setI(90);
		System.out.println(onlyPrimitive.getI());
		System.out.println(cloned.getI());
	}

}
