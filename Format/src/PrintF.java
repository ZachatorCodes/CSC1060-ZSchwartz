
public class PrintF {

	public static void main(String[] args) {
		int num1 = 234891254;
		int num2 = 546;
		
		// System.out.printf("The value is %-10d and the other is %-10d.\n", num2, num1);
		// System.out.printf("The value is %0,10d and the other is %0,10d.\n", num2, num1);
		
		double fnum1 = 23.456738;
		double fnum2 = 5687.34;
		
		// System.out.printf("The value is %.3f and the other is %.3f.\n", fnum1, fnum2);
		// System.out.printf("The value is %10f and the other is %0,10f.\n", fnum1, fnum2);

		String str1 = "Hello";
		String str2 = "World";
		
		System.out.printf("%s %s! Your lucky number is %d.\n", str1, str2, num2);
		
		String formattedStr = String.format("%s %s! Your lucky number is %d.\n", str1, str2, num2);
		
		System.out.printf(formattedStr);
	}

}
