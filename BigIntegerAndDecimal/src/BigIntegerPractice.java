import java.math.BigInteger;

public class BigIntegerPractice {

	public static void main(String[] args) {
		int n = 200;
		BigInteger fact = new BigInteger("1");
		Integer x = new Integer(4);
		
		for (int i = n; i > 0; i--) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println("The answer is " + fact);
	}

}
