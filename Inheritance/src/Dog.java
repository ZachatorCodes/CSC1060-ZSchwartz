
public class Dog extends Animal {
	
	public Dog(String name, double weight, double height) {
		super();
		setName(name);
		setWeight(weight);
		setHeight(height);
	}

	@Override
	public String makeSound() {
		return "Bark bark";
	}
	
	@Override
	public String toString() {
		return "Dog [getName()=" + getName() + ", getWeight()=" + getWeight() + ", getHeight()=" + getHeight() + "]";
	}
	
}
