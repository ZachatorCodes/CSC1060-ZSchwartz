
public class ExceptionHandling {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5};
		int num1 = 6;
		int num2 = 0;
		Integer num3 = null;
		
		try {
			int num9 = divide(num1, num2);
			int num4 = num1 / num2;
			nums[6] = 6;
			num3.intValue();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Something is wrong with the array!");
		}
		catch (ArithmeticException e) {
			System.out.println("Something is wrong with your math!");
		}
		catch (Exception e) {
			System.out.println("Some exception happened!");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Program finished!");
		}
	}
	
	public static int divide (int num1, int num2) {
		if (num2 == 0) {
			throw new ArithmeticException("Ooops");
		}
		int num3 = num1 / num2;
		return num3;
	}

}
