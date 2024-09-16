import java.util.Scanner;

public class SumInt {

	public static void main(String[] args) {
		Scanner scnObj = new Scanner(System.in);

		System.out.println("Please enter a number:");
		int userNum = scnObj.nextInt();

		int totalNum = 0;
		StringBuilder strBuilder = new StringBuilder();

		for (int i = 1; i <= userNum; i++) {
			if (i == 1) {
				strBuilder.append(i);
			}
			else {
				strBuilder.append(" + ").append(i);
			}
			totalNum += i;
		}

		strBuilder.append(" = ").append(totalNum);

		String finalString = strBuilder.toString();
		System.out.println(finalString);

	}

}
