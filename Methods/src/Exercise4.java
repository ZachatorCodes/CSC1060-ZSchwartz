import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner scnObj = new Scanner(System.in);

		System.out.println("Please pick an integer value to represent a day of the week (1 - 7)");

		System.out.println(getWeekDay(scnObj.nextInt()));
	}

	public static String getWeekDay(int day) {
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		return daysOfWeek[day - 1];
	}

	public static String getWeekDaySwitch(int day) {
		switch (day) {
		case 1:
			return "Sunday";
		case 2:
			return "Monday";
		case 3:
			return "Tuesday";
		case 4:
			return "Wednesday";
		case 5:
			return "Thursday";
		case 6:
			return "Friday";
		case 7:
			return "Saturday";
		default:
			return "Error";
		}
	}
}
