package encapsulationInJava;

import java.util.HashMap;
import java.util.Map;

public class CoffeeMachine implements CoffeeMachineIf {

	private Map<CoffeeSelection, Configuration> configMap;

	private Map<CoffeeSelection, CoffeeBean> beans;

	private Grinder grinder;

	private BrewingUnit brewingUnit;

	public CoffeeMachine(Map<CoffeeSelection, CoffeeBean> beans) {
		this.beans = beans;
		this.grinder = new Grinder();
		this.brewingUnit = new BrewingUnit();
		this.configMap = new HashMap<CoffeeSelection, Configuration>();
		this.configMap.put(CoffeeSelection.ESPRESSO, new Configuration(80, 2800));
		this.configMap.put(CoffeeSelection.FILTER_COFFEE, new Configuration(300, 4800));
	}

	@Override
	public Coffee brewCoffee(CoffeeSelection selection) throws Exception {
		switch (selection) {
		case FILTER_COFFEE:
			return brewFilterCoffee();

		case ESPRESSO:
			return brewEspresso();

		default:
			throw new Exception("CoffeeSelection [" + selection + "] not supported!");
		}
	}

	private Coffee brewEspresso() {
		Configuration config = configMap.get(CoffeeSelection.ESPRESSO);

		GroundCoffee groundCoffee = this.grinder.grind(this.beans.get(CoffeeSelection.ESPRESSO),
				this.beans.get(CoffeeSelection.ESPRESSO).getQuantity());

		// brew an espresso
		return this.brewingUnit.brew(CoffeeSelection.ESPRESSO, groundCoffee, config.getQuantityWater());
	}

	private Coffee brewFilterCoffee() {
		Configuration config = configMap.get(CoffeeSelection.FILTER_COFFEE);

		// grind the coffee beans
		GroundCoffee groundCoffee = this.grinder.grind(this.beans.get(CoffeeSelection.FILTER_COFFEE),
				this.beans.get(CoffeeSelection.FILTER_COFFEE).getQuantity());

		// brew a filter coffee
		return this.brewingUnit.brew(CoffeeSelection.FILTER_COFFEE, groundCoffee, config.getQuantityWater());
	}

	public void addBeans(CoffeeSelection sel, CoffeeBean newBeans) throws Exception {
		CoffeeBean existingBeans = this.beans.get(sel);

		if (existingBeans != null) {
			if (existingBeans.getName().equals(newBeans.getName())) {
				existingBeans.setQuantity(existingBeans.getQuantity() + newBeans.getQuantity());
			} else {
				throw new Exception("Only one kind of beans supported for each CoffeeSelection.");
			}
		} else {
			this.beans.put(sel, newBeans);
		}
	}
}