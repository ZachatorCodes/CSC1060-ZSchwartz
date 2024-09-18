
public class SumOfWhileNumbers {

	public static void main(String[] args) {
		int sum = 0;
		int numToAdd = 0;
		
		while (numToAdd < 10) {
			sum += numToAdd;
			numToAdd++;
		}
		
		System.out.println(sum);
	}

}
