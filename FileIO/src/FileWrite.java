import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		File myFile = new File("filewritetest.txt");
		
		if (!myFile.exists()) {
			myFile.createNewFile();
		}
		
		FileWriter fileWriter = new FileWriter(myFile.getName(), false);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write("The moon is full today.\n");
		bufferedWriter.write("It is an auspicious day!\n");
		bufferedWriter.append("Wahoo!\n");
		bufferedWriter.flush();
//		bufferedWriter.close();
//		fileWriter.close();
	}

}
