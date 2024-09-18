import java.util.Scanner;

public class PizzaOrderPrep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnObj = new Scanner(System.in);
		
		System.out.println("Do you want a pizza? (1 for yes | 0 for no)");
		int pizzaOrder = scnObj.nextInt();
		
		System.out.println("Do you want wings? (1 for yes | 0 for no)");
		int wingOrder = scnObj.nextInt();
		
		System.out.println("Do you want a salad? (1 for yes | 0 for no)");
		int saladOrder = scnObj.nextInt();
		
		double totalCost = 0;
		
		if (pizzaOrder == 0 && wingOrder == 0 && saladOrder == 0) {
			System.out.println("You didn't order anything!");
		}
		if (pizzaOrder == 1) {
			System.out.println("You ordered a pizza!");
			totalCost += 6.99;
		}
		if (wingOrder == 1) {
			System.out.println("You ordered wings!");
			totalCost += 7.99;
		}
		if (saladOrder == 1) {
			System.out.println("You ordered a salad!");
			totalCost += 8.79;
		}
		System.out.printf("Your total cost is $%.2f.", totalCost);
	}
}
