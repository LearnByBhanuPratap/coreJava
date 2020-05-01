package concurrentHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapStructure {

	/**
	 * @author Arpit Mandliya
	 */
	public static void main(String[] args) {

		Country india = new Country("India", 1000);
		Country japan = new Country("Japan", 10000);

		Country france = new Country("France", 2000);
		Country russia = new Country("Russia", 20000);

		ConcurrentHashMap<Country, String> countryCapitalMap = new ConcurrentHashMap<Country, String>();
		countryCapitalMap.put(india, "Delhi");
		countryCapitalMap.put(japan, "Tokyo");
		countryCapitalMap.put(france, "Paris");
		countryCapitalMap.put(russia, "Moscow");

		Iterator countryCapitalIter = countryCapitalMap.keySet().iterator();// put debug point at this line
		while (countryCapitalIter.hasNext()) {
			countryCapitalIter.remove();
			Country countryObj = (Country) countryCapitalIter.next();
			String capital = countryCapitalMap.get(countryObj);
			System.out.println(countryObj.getName() + "----" + capital);
		}
	}

}