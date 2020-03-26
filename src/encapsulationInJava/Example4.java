package encapsulationInJava;

public class Example4 {
	
	private String schoolName = "ABC";

	private String studentName;
	
	
	public String getSchoolName() {
		return schoolName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return "Example4 [schoolName=" + schoolName + ", studentName=" + studentName + "]";
	}
	
	
}
