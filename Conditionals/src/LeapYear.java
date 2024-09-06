import java.util.Scanner;

public class LeapYear {
	
	static Scanner scnObj = new Scanner(System.in);
	static boolean leapYear;

	public static void main(String[] args) {
		
		System.out.println("What year do you want to check?");
		int year = scnObj.nextInt();
		checkLeapYear(year);
		
		if (leapYear) {
			System.out.printf("The year %d is a leap year.", year);
		} else {
			System.out.printf("The year %d is not a leap year.", year);
		}
	}
	
	public static void checkLeapYear(int year) {
		if (year % 400 == 0) {
			leapYear = true;
		} else if (year % 100 == 0) {
			leapYear = false;
		} else if (year % 4 == 0) {
			leapYear = true;
		} else {
			leapYear = false;
		}
	}
}
