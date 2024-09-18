import java.util.Scanner;

public class SummerTemp {

	public static void main(String[] args) {
		Scanner scnObj = new Scanner(System.in);

		System.out.println("What is the temperature?");
		double temperature = scnObj.nextDouble();

		checkTemp(temperature);
	}

	public static void checkTemp(double temp) {
		if (temp <= 0) {
			System.out.println("Gosh darn it's cold as heck!");
		}
		else if (temp > 0 && temp <= 20) {
			System.out.println("It's still cold but getting a little bit warmer.");
		}
		else if (temp > 20 && temp <= 40) {
			System.out.println("I'm still a little cold but at least we can get above freezing!");
		}
		else if (temp > 40 && temp <= 60) {
			System.out.println("The temperature is starting to get nice!");
		}
		else if (temp > 60 && temp <= 80) {
			System.out.println("What a perfect range to enjoy the day!");
		}
		else {
			System.err.println("DON'T GO OUTSIDE IT'S TOO HOT!");
		}
	}
}
