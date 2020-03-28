package encapsulationInJava;

import java.util.HashMap;
import java.util.Map;

public class CoffeeApp {
	
	public static void main(String[] args) {
		
		Map<CoffeeSelection, CoffeeBean> beans = new HashMap<CoffeeSelection, CoffeeBean>();
		
		beans.put(CoffeeSelection.ESPRESSO, new CoffeeBean("My favorite espresso bean", 10));
		beans.put(CoffeeSelection.FILTER_COFFEE, new CoffeeBean("My favorite filter coffee bean", 4));
		CoffeeMachineIf machine = new CoffeeMachine(beans);
		try {
			Coffee espresso = machine.brewCoffee(CoffeeSelection.ESPRESSO);
			System.out.println("Your " + espresso.getSelection() + " is ready");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}