
public class Cat extends Animal {
	private String color;
	
	public Cat() {
		super();
		this.color = "Clear";
	}
	
	public Cat(String name, double weight, double height, String color) {
		super(name, weight, height);
		this.color = color;
	}

//	@Override
	public String makeSound() {
		return "Meow meow";
	}
	
	@Override
	public String toString() {
		return "Cat [color=" + color + ", getName()=" + getName() + ", getWeight()=" + getWeight() + ", getHeight()="
				+ getHeight() + "]";
	}
	
}