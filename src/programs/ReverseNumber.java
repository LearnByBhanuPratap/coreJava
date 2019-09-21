package programs;

import java.util.Scanner;

public class ReverseNumber {
	
	public void reverseNumber(){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number");
		int number = scn.nextInt();
		int reverse = 0;
		while(number!=0){
			reverse = reverse*10;
			reverse = reverse + number%10;
			number = number/10;
		}
		System.out.println("Reversed number is:-"+reverse);
	}
	
	public static void main(String[] args) {
		ReverseNumber obj = new ReverseNumber();
		obj.reverseNumber();
}
}
