
public class Animal {
	private String name;
	private double weight;
	private double height;
	
	public Animal() {
		super();
		name = "Animal";
		weight = 1.0;
		height = 1.0;
	}

	public Animal(String name, double weight, double height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public String makeSound() {
		return "Blah Blah";
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + ", height=" + height + "]";
	}
	
	
}
