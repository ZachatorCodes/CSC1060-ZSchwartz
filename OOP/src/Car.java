
public class Car {
	// Data Members / Object Properties
	private String color;
	private int milage;
	private double amountOfGas;
	private boolean isClean = false;
	
	// Constructors
	public Car() {
		color = "Pink";
		milage = 4;
		amountOfGas = 2.0;
		isClean = false;
	}
	
	public Car(String color, int milage) {
		this.color = color;
		this.milage = milage;
		amountOfGas = 2.0;
	}
	

	public Car(String color, int milage, double amountOfGas) {
		this.color = color;
		this.milage = milage;
		this.amountOfGas = amountOfGas;
	}
	
	public Car(String color, double amountOfGas, int milage) {
		this.color = color;
		this.milage = milage;
		this.amountOfGas = amountOfGas;
	}

	// Getters & Setters (Accessor & Mutators)
	public boolean isClean() {
		return isClean;
	}
	
	public void setClean(boolean isClean) {
		this.isClean = isClean;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMilage() {
		return milage;
	}

	public double getAmountOfGas() {
		return amountOfGas;
	}

	public void setAmountOfGas(double amountOfGas) {
		this.amountOfGas = amountOfGas;
	}
	
	// Methods
	public void drive(int miles) {
		for (int i = 0; i < miles; i++) {
			System.out.print("+");
		}
		System.out.println();
		
		milage += miles;
		amountOfGas -= 0.2 * miles;
	}
	
	public void selfClean() {
		isClean = true;
	}
	
	// toString method
	@Override
	public String toString() {
		String str = "Color: " + color + " | Milage: " + milage + " | Amount of Gas: " + amountOfGas + " | Clean: " + isClean;
		return str;
	}
	
}
