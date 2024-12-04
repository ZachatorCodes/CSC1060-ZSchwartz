import java.math.BigInteger;

public class BigIntegerPractice {

	public static void main(String[] args) {
		int n = 10;
		BigInteger fact = BigInteger.valueOf(1);
		
		for (int i = n; i > 0; i--) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println("The answer is " + fact);
		
		String dbValue = "657.151";
		double dbl = Double.parseDouble(dbValue);
		System.out.println(dbl);
	}

}
