
public class Farm {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Bunk", 15, 12, "Black");
		System.out.println(cat1);
		
		Cat cat2 = new Cat();
		System.out.println(cat2);
		
		Dog dog1 = new Dog("Tiny", 40, 100);
		System.out.println(dog1);
		
		System.out.println(cat2.makeSound());
	}

}
