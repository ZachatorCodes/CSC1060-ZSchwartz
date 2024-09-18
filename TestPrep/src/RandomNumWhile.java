import java.util.Random;

public class RandomNumWhile {

	public static void main(String[] args) {
		Random rand = new Random();
		boolean choice = true;
		
		while (choice) {
			int randomNum = rand.nextInt(1, 11);
			System.out.println(randomNum);
			if (randomNum == 10) {
				choice = false;
			}
		}
	}
}
