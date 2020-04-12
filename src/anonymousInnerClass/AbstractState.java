package anonymousInnerClass;

public abstract class AbstractState {
	
	String s1 = "";

	abstract void population();

	void numberOfDistrict(int number) {
		System.out.println("numberOfDistrict is " + number);
	}
}
