import java.util.Scanner;

public class QuadraticRoots {

	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);
		
		// Initialize variables
		int valueA;
		int valueB;
		int valueC;
		
		// Assign values to variables
		System.out.println("What is the value of A?");
		valueA = scannerObj.nextInt();
		
		System.out.println("What is the value of B?");
		valueB = scannerObj.nextInt();
		
		System.out.println("What is the value of C?");
		valueC = scannerObj.nextInt();
		
		// Calculate the value within the square root
		double rootValue = Math.sqrt((valueB * valueB) - (4.0 * valueA * valueC));
		
		// Add root value to B
		double positiveRoot = (valueB * -1.0) + rootValue;
		
		// Subtract root value from B
		double negativeRoot = (valueB * -1.0) - rootValue;
		
		// Calculate Answer
		double positiveAnswer = positiveRoot / (2 * valueA);
		double negativeAnswer = negativeRoot / (2 * valueA);
		
		System.out.println(positiveAnswer);
		System.out.println(negativeAnswer);
		
	}

}
