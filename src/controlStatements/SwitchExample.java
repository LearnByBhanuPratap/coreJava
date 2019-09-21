package controlStatements;

public class SwitchExample {

	public void checkBookTypeAndPrice(String bookName) {
		String s1;
		switch (bookName) {
		case "MATH":
			s1 = "Author Aryabhata Price=200";
			System.out.println(s1);
			break;
		case "PHYSICS":
			s1 = "Author Bhanu Prata Price=100";
			System.out.println(s1);
			break;
		case "CHEMISTRY":
			s1 = "Author Pratap Price=300";
			System.out.println(s1);
			break;
		default:
			System.out.println("No Book Found Supply Proper Input");
		}
	}
	
	public static void main(String[] args) {
		SwitchExample switchExample = new SwitchExample();
		switchExample.checkBookTypeAndPrice("MATH1");
	}

}
