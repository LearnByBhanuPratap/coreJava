package encapsulationInJava;

public class TestExample5 {

	private int[] a = { 1, 2, 3, 4 };

	public int[] getA() {
		return a.clone();
	}

	public void setA(int[] a) {
		this.a = a;
	}

}
