import java.util.Scanner;

public class TempCalculator {

	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);
		
		System.out.println("Please enter a temperature in Farenheit:");
		
		double farenheitTemp = scannerObj.nextDouble();
		
		double celsiusTemp = (farenheitTemp - 32) * (5.0 / 9.0);
		
		double kelvinTemp = celsiusTemp + 273.15;
		
		System.out.printf("%s degrees Farenheit is %s degrees Celsius and %s degrees Kelvin.\n", farenheitTemp, celsiusTemp, kelvinTemp);
		
		scannerObj.close();
	}

}
