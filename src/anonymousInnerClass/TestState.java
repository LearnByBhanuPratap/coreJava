package anonymousInnerClass;

public class TestState {

	State biharState = new State() {

		@Override
		public void population() {

			System.out.println("population is 21 crore");

		}

		@Override
		public void numberOfDistrict() {
			System.out.println("numberOfDistrict is 80");

		}
	};
	
	State upState = new State() {

		@Override
		public void population() {

			System.out.println("population is 15 crore");

		}

		@Override
		public void numberOfDistrict() {
			System.out.println("numberOfDistrict is 800");

		}
	};
}
