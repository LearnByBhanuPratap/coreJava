package enumjava;

public enum State {

	BIHAR(100, "Hindi", "Bjp"), UP(1000, "Hindi", "Bjp"), MP(100, "Hindi", "Congress"), GOA(100, "Hindi", "Test");

	 private State(int population, String language, String party) {
		this.population = population;
		this.language = language;
		this.party = party;
	}

	private int population;
	private String language;
	private String party;

	public int getPopulation() {
		return population;
	}

	public String getLanguage() {
		return language;
	}

	public String getParty() {
		return party;
	}

}
