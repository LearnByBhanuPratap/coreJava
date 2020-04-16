package arrayList;

public class State {

	private int population;
	private String district;
	private String language;
	
	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public State(int population, String district, String language) {
		super();
		this.population = population;
		this.district = district;
		this.language = language;
	}

	@Override
	public String toString() {
		return "State [population=" + population + ", district=" + district + ", language=" + language + "]";
	}


}
