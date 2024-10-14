
public class Driver {
	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println("Color: " + myCar.getColor());
		
		myCar.setColor("Red");
		System.out.println("Color: " + myCar.getColor());
		
		System.out.println(myCar);
		
		Car car1 = new Car("Blue", 3.0, 5);
		Car car2 = new Car("Blue", 5, 3.0);
		
		myCar.selfClean();
		
		myCar.drive(10);
		System.out.println(myCar);
		
		Person person = new Person("Zach", "Schwartz", 6.5, 190);
		
		System.out.println(person);
		
	}
}
