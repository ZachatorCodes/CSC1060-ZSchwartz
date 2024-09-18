import java.util.Scanner;

public class SumIntWhile {

	public static void main(String[] args) {
		Scanner scnObj = new Scanner(System.in);

		System.out.println("Please enter a number:");
		int userNum = scnObj.nextInt();

		int totalNum = 0;
		int incrementor = 1;
		StringBuilder strBuilder = new StringBuilder();
		
		while (incrementor <= userNum) {
			if (incrementor == 1) {
				strBuilder.append(incrementor);
			} else {
				strBuilder.append(" + ").append(incrementor);
			}
			totalNum += incrementor;
			incrementor++;
		}

		strBuilder.append(" = ").append(totalNum);

		String finalString = strBuilder.toString();
		System.out.println(finalString);
	}

}
