
public class Calculator {

	public static void main(String[] args) {
		int x1 = 3;
		int x2 = 4;
		int x3 = add(x1, x2);
		System.out.printf("%d + %d = %d", x1, x2, add(x1, x2));
	}
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	public static double div(double num1, double num2) {
		return num1 / num2;
	}

}
