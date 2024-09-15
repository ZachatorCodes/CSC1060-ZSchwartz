import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		
		// Create Scanner object
		Scanner scnObj = new Scanner(System.in);
		
		// Prompt user and store input as grade
		System.out.println("What is your grade?");
		double grade = scnObj.nextDouble();
		
		// Catch a grade less than 0
		if (grade < 0) {
			System.out.println("Error: Grade less than 0.");
		}
		else {
			// Calculate letter and print result
			System.out.println(calculateGrade(grade));
		}
		
	}
	
	public static String calculateGrade(double grade) {
		
		if (grade >= 92) {
			return "A";
		}
		else if ((grade >= 89) && (grade < 92)) {
			return "A-";
		}
		else if ((grade >= 87) && (grade < 89)) {
			return "B+";
		}
		else if ((grade >= 82) && (grade < 87)) {
			return "B";
		}
		else if ((grade >= 79) && (grade < 82)) {
			return "B-";
		}
		else if ((grade >= 77) && (grade < 79)) {
			return "C+";
		}
		else if ((grade >= 72) && (grade < 77)) {
			return "C";
		}
		else if ((grade >= 69) && (grade < 72)) {
			return "C-";
		}
		else if ((grade >= 67) && (grade < 69)) {
			return "D+";
		}
		else if ((grade >= 60) && (grade < 67)) {
			return "D";
		}
		else {
			return "F";
		}
		
	}

}
