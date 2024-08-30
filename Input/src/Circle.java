import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scannerObj = new Scanner(System.in);
		
		System.out.println("What is the radius of your circle?");
		double radius = scannerObj.nextDouble();
		
		double perimeter = Math.PI * 2 * radius;
		double area = Math.PI * radius * radius;
		
		System.out.printf("Radius = %s\nPerimeter is = %s\nArea is = %s", radius, perimeter, area);
	}

}
