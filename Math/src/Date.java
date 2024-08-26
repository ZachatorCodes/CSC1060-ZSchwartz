
public class Date {

	public static void main(String[] args) {
		
		String day = "Monday";
		String month = "August";
		int date = 26;
		int year = 2024;
		
		// Using concatenation
		String american = "American Format: " + day + ", " + month + " " + date + ", " + year;
		String european = "European Format: " + day + " " + date + " " + month + " " + year;
		
		System.out.println("Using String Concatenation:");
		System.out.println(american);
		System.out.println(european + "\n");
		
		// Using interpolation
		String americanFormat = String.format("American Format: %s, %s %s, %s", day, month, date, year);
		String europeanFormat = String.format("European Format: %s %s %s %s", day, date, month, year);

		System.out.println("Using Interpolation (String Format Method):");
		System.out.println(americanFormat);
		System.out.println(europeanFormat);
		
	}

}
