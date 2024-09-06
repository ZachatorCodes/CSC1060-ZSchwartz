import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scnObj = new Scanner(System.in);
		System.out.println("What year do you want to check?");
		int year = scnObj.nextInt();
		boolean leapYear = checkLeapYear(year);
		displayLeapYear(leapYear, year);
	}

	public static boolean checkLeapYear(int year) {
		if (year % 400 == 0) {
			return true;
		} else if (year % 100 == 0) {
			return false;
		} else if (year % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void displayLeapYear(boolean leapYear, int year) {
		if (leapYear) {
			System.out.printf("The year %d is a leap year.", year);
		} else {
			System.out.printf("The year %d is not a leap year.", year);
		}
	}
}
