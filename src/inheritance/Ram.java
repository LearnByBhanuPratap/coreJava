package inheritance;

public class Ram extends Student {

	int roolnumber;

	public Ram(int roolnumber) {
		this.roolnumber = roolnumber;
	}

	public String display() {
		return "Ram [roolnumber=" + roolnumber + ", getSchooladdress()=" + getSchooladdress() + ", getSchoolName()="
				+ getSchoolName() + "]";
	}



	public static void main(String[] args) {
		Ram ram = new Ram(8);
		ram.getSchooladdress();
		ram.getSchoolName();
		
		System.out.println(ram.Schooladdress); 
		
		System.out.println(ram.display());
	}
}
