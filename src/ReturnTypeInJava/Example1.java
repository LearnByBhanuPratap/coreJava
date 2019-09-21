package ReturnTypeInJava;

public class Example1 {

	private double d = 90.980;
	private String s1 = "Test";
	private int i = 90;
	private float f = 2.80f;
	private long l = 2l;
	private char c = 'a';
	private boolean b = true;
	
	private int[] array = {20,30,40};

	private Example1 example1;

	public double getD() {
		return d;
	}
	
	public void getD1() {
		//return d;
	}

	public String getS1() {
		return s1;
	}

	public int getI() {
		return i;
	}

	public float getF() {
		return f;
	}

	public long getL() {
		return l;
	}

	public char getC() {
		return c;
	}

	public boolean isB() {
		return false;
	}

	public Example1 getExample1() {
		return example1;
	}
	

	public int[] getArray() {
		int[] a = {20,30,40};
		int[] b = new int[6];
		b[0] = 90;
		return b;
	}

	public static void main(String[] args) {
		Example1 obj = new Example1();
		System.out.println(obj.getD());
	}

}
