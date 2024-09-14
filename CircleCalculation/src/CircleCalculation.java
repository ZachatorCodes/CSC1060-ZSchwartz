import java.util.Scanner;

public class CircleCalculation {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner scnObj = new Scanner(System.in);
		
		// Prompt user and store input
		System.out.println("What is the radius of your circle?");
		double radius = scnObj.nextDouble();
		
		// Display radius, diameter, area, and circumference to two decimal points
		// Each piece of information is printed to a new line with \n
		System.out.printf("Radius: %.2f\nDiameter: %.2f\nArea: %.2f\nCircumference: %.2f",
				radius, diameter(radius), area(radius), circumference(radius));
	}
	
	public static double diameter(double radius) {
		// Returns the diameter
		return (2 * radius);
	}
	
	public static double area(double radius) {
		// Returns the area
		return (Math.PI * Math.pow(radius, 2));
	}

	public static double circumference(double radius) {
		// Returns the circumference
		return (2 * Math.PI * radius);
	}

}
