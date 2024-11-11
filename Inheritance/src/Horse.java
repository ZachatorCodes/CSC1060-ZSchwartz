
public class Horse extends Animal {
	private String type;
	
	public Horse() {
		super();
		this.type = "Wild";
	}
	
	public Horse(String name, double weight, double height, String type) {
		super(name, weight, height);
		this.type = type;
	}
	
	@Override
	public String makeSound() {
		return "Neigh neigh";
	}
}
