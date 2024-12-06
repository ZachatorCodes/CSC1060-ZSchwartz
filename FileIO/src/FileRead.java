import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		File readFile = new File("addresses.csv");
		Scanner scn = null;
	
		try {
			scn = new Scanner(readFile);
		}
		catch (FileNotFoundException e) {
			System.out.println("Error: File Not Found");
			System.out.println("Gooddbye");
			System.exit(-1);
		}
		
		boolean header = true;
		while (scn.hasNextLine()) {
			if (header) {
				scn.nextLine();
				header = false;
			}
			String line = scn.nextLine();
			String[] tokens = line.split(",");
			String firstName = tokens[0];
			String lastName = tokens[1];
			String address = tokens[2];
			System.out.println("First Name: " + firstName);
			System.out.println("Last Name: " + lastName);
			System.out.println("Address: " + address);
			System.out.println();
		}
	}

}
