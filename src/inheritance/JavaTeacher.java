package inheritance;

public class JavaTeacher extends Teacher {

	String mainSubject = "Spark";

	public static void main(String args[]) {
		
		JavaTeacher obj = new JavaTeacher();
		
		System.out.println(obj.collegeName);
		System.out.println(obj.designation);
		System.out.println(obj.mainSubject);
		
		obj.does();
	}
}
