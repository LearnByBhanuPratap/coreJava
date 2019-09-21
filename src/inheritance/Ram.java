package inheritance;
public class Ram extends Student{
	
	int roolnumber;

	public Ram(int roolnumber) {
		this.roolnumber = roolnumber;
	}
	
	public void display() {
		String s1 = "Ram [roolnumber=" + roolnumber + ", getSchooladdress()=" + getSchooladdress() + ", getSchoolName()="
				+ getSchoolName() + "]";
		System.out.println(s1);
	}

	public static void main(String[] args) {
		Ram ram = new Ram(8);
		ram.display();
	}
}
