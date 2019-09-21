package methodOverloading;

public class Overloading3 {

	private String formatNumber(int value) {
		return String.format("%d", value);
	}

	private String formatNumber(double value) {
		return String.format("%.3f", value);
	}

	private String formatNumber(String value) {
		return String.format("%.2f", Double.parseDouble(value));
	}

	public static void main(String[] args) {
		Overloading3 hs = new Overloading3();
		System.out.println(hs.formatNumber(500));
		System.out.println(hs.formatNumber(89.9934));
		System.out.println(hs.formatNumber("550"));
	}
}
