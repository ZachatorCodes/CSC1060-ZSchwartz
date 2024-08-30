import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// Create scanner object
		Scanner scannerObj = new Scanner(System.in);
		
		// Store radius value as a variable through the scanner
		System.out.println("What is the radius of your circle?");
		double radius = scannerObj.nextDouble();
		
		// Solve for perimeter and area of a circle
		double perimeter = Math.PI * 2 * radius;
		double area = Math.PI * radius * radius;
		
		// Print out all information
		System.out.printf("Radius = %s\nPerimeter is = %s\nArea is = %s", radius, perimeter, area);
	}

}
