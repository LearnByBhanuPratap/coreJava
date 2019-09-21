package staticBlock;

public class Student {

	private static String collegeName;
	private String studentName;
	private int rollnumber;
	private static int i;

	Student(String studentName) {
		this.studentName = studentName;
		this.rollnumber = increaseRollNumber();
	}

	public static String getCollegeName() {
		return collegeName;
	}

	public static void setCollegeName(String collegeName) {
		Student.collegeName = collegeName;
	}

	public static int increaseRollNumber() {
		return i++;
	}

	public void getStudentInformation() {
		System.out.print("student Name : " + this.studentName);
		System.out.print(" roll Number : " + this.rollnumber);
		System.out.print(" college Name : " + collegeName);
		System.out.println();
	}

	public static void main(String[] args) {
		Student.setCollegeName("LS college");

		Student obj = new Student("Ram");
		obj.getStudentInformation();
		Student obj1 = new Student("Mohan");
		obj1.getStudentInformation();
	}

}
