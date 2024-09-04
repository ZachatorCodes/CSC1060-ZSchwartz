import java.util.Scanner;

public class Cylinder {

	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);
		
		System.out.println("What is the radius of your cylinder?");
		double radius = scannerObj.nextDouble();
		
		System.out.println("What is the length of your cylinder?");
		double length = scannerObj.nextDouble();
		
		double area = calcArea(radius);
		double volume = calcVolume(area, length);
		
		System.out.printf("The area of the cylinder is %f units squared", area);
		System.out.printf("The volume of the cylinder is %f units cubed", volume);
	}
	
	public static double calcArea(double radius) {
		return Math.pow(radius, 2) * Math.PI;
	}
	
	public static double calcVolume(double area, double length) {
		return area * length;
	}

}
