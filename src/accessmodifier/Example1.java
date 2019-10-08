package accessmodifier;

public class Example1 {

	public String s1;

	private String s2;

	protected String s3;

	String s4;

	protected void name1() {
		System.out.println("protected method");
	}

	public void name2() {
		System.out.println("public method");
	}

	private void name3() {
		System.out.println("private method");
	}

	void name4() {
		System.out.println("default method");
	}
	
	public static void main(String[] args) {
		Example1 obj = new Example1();
		obj.name1();
	}

}
