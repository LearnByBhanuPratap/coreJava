package exception;

public class Example5 {

	public static void main(String[] args) {
		try {
			Class.forName("Test1278778787");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
