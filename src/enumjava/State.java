package enumjava;

public enum State {

	BIHAR(100, "Hindi", "Bjp"), UP(1000, "Hindi", "Bjp"), MP(100, "Hindi", "Congress"), GOA(100, "Hindi", "Test");

	State(int population, String language, String party) {

	}

	public static String getLanguage(State state) {

		State[] values = state.values();

		for (State state2 : values) {
			if (state2.equals(state)) {
				values = State.values();
				return values[2].name();
			}
		}
		return null;
	}
}
