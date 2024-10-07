import java.util.Scanner;

public class Sales {

	public static void main(String[] args) {
		Scanner scnObj = new Scanner(System.in);
		
		System.out.print("How many salespeople would you like to keep track of? ");
		int[] employees = new int[scnObj.nextInt()];
		
		System.out.println();
		
		for (int i = 0; i < employees.length; i++) {
			System.out.printf("Please enter sales amount for employee #%d: ", (i + 1));
			employees[i] = scnObj.nextInt();
		}
		
		System.out.println();
		
		int minSale = employees[0];
		int maxSale = employees[0];
		int totalSale = 0;
		
		for (int i = 0; i < employees.length; i++) {
			System.out.printf("Employee %d: $%d\n", (i + 1), employees[i]);
			totalSale += employees[i];
			if (employees[i] < minSale) {
				minSale = employees[i];
			}
			if (employees[i] > maxSale) {
				maxSale = employees[i];
			}
		}
		
		System.out.println();
		
		int averageSale = totalSale / employees.length;
		
		System.out.printf("Total Sales: $%d\n", totalSale);
		System.out.printf("Max Sale: $%d\n", maxSale);
		System.out.printf("Min Sale: $%d\n", minSale);
		System.out.printf("Average Sale: $%d\n", averageSale);

	}

}
