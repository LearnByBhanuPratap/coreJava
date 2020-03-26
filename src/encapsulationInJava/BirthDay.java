package encapsulationInJava;

import java.util.Date;

public class BirthDay {

	private Date birthDate;
	
	private Date birthDate_1;

	public void setBirthDate(Date date) {
		this.birthDate = (Date) date.clone();
	}

	public Date getBirthDate() {
		return (Date) this.birthDate.clone();
	}
	
	public void setBirthDate_1(Date date) {
		this.birthDate_1 = date;
	}

	public Date getBirthDate_1() {
		return birthDate_1;
	}
	public static void main(String[] args) {
		BirthDay birthDay = new BirthDay();
		Date date = new Date();
		birthDay.setBirthDate(date);
		date.after(new Date(200l));
		
		System.out.println(birthDay.getBirthDate());
		
		BirthDay birthDay1 = new BirthDay();
		Date date1 = new Date();
		birthDay1.setBirthDate_1(date1);
		date1.after(new Date(200l));
		
		System.out.println(birthDay1.getBirthDate_1());
		
	}
}
