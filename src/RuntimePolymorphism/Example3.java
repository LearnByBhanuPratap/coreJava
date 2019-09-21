package RuntimePolymorphism;

public class Example3 {
	
	float getRateOfInterest() {
		return 0;
	}
}

class SBI extends Example3 {
	float getRateOfInterest() {
		return 7.4f;
	}
}

class ICICI extends Example3 {
	float getRateOfInterest() {
		return 7.3f;
	}
}

class HDFC extends Example3 {
	float getRateOfInterest() {
		return 8.7f;
	}
}

class TestPolymorphism {
	public static void main(String args[]) {
		Example3 b;
		b = new SBI();
		System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
		b = new ICICI();
		System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
		b = new HDFC();
		System.out.println("HDFC Rate of Interest: " + b.getRateOfInterest());
	}
}