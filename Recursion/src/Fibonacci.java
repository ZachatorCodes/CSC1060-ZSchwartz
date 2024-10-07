
public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(findFibTerm(5));
	}
	
	public static int findFibTerm(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		else {
			int term = findFibTerm(n - 1) + findFibTerm(n - 2);
			return term;
		}
	}

}
