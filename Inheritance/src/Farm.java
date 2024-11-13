
public class Farm {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Bunk", 15, 12, "Black");
		System.out.println(cat1);
		
		Cat cat2 = new Cat();
		System.out.println(cat2);
		
		Dog dog1 = new Dog("Tiny", 40, 100);
		System.out.println(dog1);
		
//		System.out.println(cat2.makeSound());
		
		Horse horse1 = new Horse("Roscoe", 1200, 6, "Gelding");
		
		Animal[] animals = new Animal[5];
		
		animals[0] = cat1;
		animals[1] = cat2;
		animals[2] = dog1;
		animals[3] = horse1;
		animals[4] = new Horse("Tunkus", 2500, 12, "Crazy");
		
		for (Animal animal: animals) {
			if (animal instanceof Horse) {
				Horse horse = (Horse) animal;
				System.out.println(horse.makeSound());
//				System.out.println(((Horse)animal).makeSound());
			}
			if (animal instanceof Dog) {
				System.out.println(animal);
			}
		}
	}

}
