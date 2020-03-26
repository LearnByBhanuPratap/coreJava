package encapsulationInJava;

public class EncapsulationTest1 {

	public static void main(String[]args) {
		
		Student st = new Student();
		//st.id = "5"; // As the field is not private. So, it can be accessed by
						// anyone from outside the class.
		
		st.setId("5");
		String data = st.getId();
		
		System.out.println(data);
	}
}
