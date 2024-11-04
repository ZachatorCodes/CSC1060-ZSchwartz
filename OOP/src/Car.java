import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {
	// Data Members / Object Properties
	private static List<Car> cars = new ArrayList<>();
	private static int idCount = 0;
	private int id;
	private String color;
	private int milage;
	private double amountOfGas;
	private boolean isClean = false;
	private SteeringWheel stWheel;
	private Wheel[] wheels = new Wheel[4];

	// Constructors
	public Car() {
		cars.add(this);
		idCount++;
		id = idCount;
		color = "Pink";
		milage = 4;
		amountOfGas = 2.0;
		isClean = false;
		for (int i = 0; i < wheels.length; i++) {
			wheels[i] = new Wheel(color, 22);
		}
	}

	public Car(String color, int milage) {
		idCount++;
		id = idCount;
		this.color = color;
		this.milage = milage;
		amountOfGas = 2.0;
	}

	public Car(String color, int milage, double amountOfGas) {
		idCount++;
		id = idCount;
		this.color = color;
		this.milage = milage;
		this.amountOfGas = amountOfGas;
	}

	public Car(String color, double amountOfGas, int milage) {
		idCount++;
		id = idCount;
		this.color = color;
		this.milage = milage;
		this.amountOfGas = amountOfGas;
	}

	public Car(String color, double amountOfGas, int milage, boolean threeSpoke, String stMaterial) {
		idCount++;
		id = idCount;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Car [id=" + id + ", color=" + color + ", milage=" + milage + ", amountOfGas=" + amountOfGas
				+ ", isClean=" + isClean + ", stWheel=" + stWheel + ", wheels=" + Arrays.toString(wheels) + "]";
	}

}
