package anonymousInnerClass;

public class TestAbstractState {
	
	AbstractState biharAbstractState = new AbstractState() {
		
		@Override
		void population() {
		
			System.out.println("population is 15 crore");
			
		}
	};
	
	AbstractState upAbstractState = new AbstractState() {
		
		@Override
		void population() {
		
			System.out.println("population is 21 crore");
			
		}
	};
	
	public static void main(String[] args) {
		TestAbstractState abstractState = new TestAbstractState();
		abstractState.biharAbstractState.population();
		abstractState.biharAbstractState.numberOfDistrict(90);
		abstractState.upAbstractState.population();
		abstractState.upAbstractState.numberOfDistrict(900);
	}

}
