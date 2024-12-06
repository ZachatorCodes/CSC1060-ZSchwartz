import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteCSV {

	public static void main(String[] args) {
		File myFile = new File("addresses.csv");
		FileWriter fileWriter = null;
	
		try {
			if (myFile.exists()) {
				myFile.delete();
			}
			if (!myFile.exists()) {
				myFile.createNewFile();
			}
			fileWriter = new FileWriter(myFile.getName(), false); // true / false value determines whether to add or reset file
		}
		catch (IOException e) {
			System.out.println("Error: IO Exception Caught");
			System.out.println("Bye Bye :)");
			System.exit(-1);
		}
	
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		try {
			bufferedWriter.write("FirstName,LastName,Addres\n");
			bufferedWriter.write("John,Doe,345 Maple St.\n");
			bufferedWriter.append("Jane,Doe,649 Acorn Dr.\n");
			bufferedWriter.append("Tubby,Bunk,123 Bee Ln.\n");
			bufferedWriter.flush();
			bufferedWriter.close();
			fileWriter.close();
		}
		catch (IOException e) {
			System.out.println("Error: IO Exception Caught");
			System.out.println("Bye Bye :)");
		}
	}

}
