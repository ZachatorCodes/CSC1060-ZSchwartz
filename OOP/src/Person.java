public class Person {
	private String firstName;
	private String lastName;
	private double height;
	private double weight;
	
	public Person(String firstName, String lastName, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.height = height;
		this.weight = weight;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", height=" + height + ", weight=" + weight
				+ "]";
	}	
}
