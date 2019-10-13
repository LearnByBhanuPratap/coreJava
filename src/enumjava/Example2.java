package enumjava;

public class Example2 {

	enum Season {
		WINTER(5), SPRING(10), SUMMER(15), FALL(20);

		private int value;

		private Season(int value) {
			this.value = value;
		}
		
		public int getValue(){
			return value;
		}
	}

	public static void main(String args[]) {
		System.out.println(Season.WINTER.value);
		
		for (Season s : Season.values())
			System.out.println(s + " " + s.value);

	}
}
