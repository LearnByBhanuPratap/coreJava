package enumjava;
public class TestState {
	public static void main(String[] args) {
		String data = State.BIHAR.getLanguage();
		String party = State.MP.getParty();
		
		System.out.println(data);
		System.out.println(party);
		
		if(State.BIHAR.name().equals("BIHAR")){
			System.out.println("---");
		}
		
		State datai = State.valueOf("BIHAR");
		System.out.println(datai.getParty());
		
		System.out.println();

	}
}
