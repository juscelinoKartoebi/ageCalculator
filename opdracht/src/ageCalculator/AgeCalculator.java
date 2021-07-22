package ageCalculator;

import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args){
		
		int age;
		int dob;
		int currentYear = 2021;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter ur date of birth: ");
		
		dob = input.nextInt();
		
		System.out.println("Date of birth entered by user: " + dob);
		
		if(dob>=currentYear) {
			
		System.out.println("Enter a date of birth less than "+ currentYear);
	    
		}else {
			
		age = currentYear - dob;
		
		System.out.println("Your age is: "+ age);
	}

	}

}
