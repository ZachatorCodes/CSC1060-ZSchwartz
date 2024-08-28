import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);
		
		System.out.println("What is your name?");
		
		String userName = scannerObj.nextLine();
		
		System.out.printf("Your name is %s.", userName);
		
		scannerObj.close();
	}

}
