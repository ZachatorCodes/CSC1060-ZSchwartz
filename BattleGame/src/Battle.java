import java.util.Random;

public class Battle {
	private static Random randObj = new Random();
	public static void main(String[] args) {
		// Create characters with weapons
		Character monster = new Character("Blingus Blightington", 100, 100, 30, new Weapon("Claws", 5, 0.4));
		Character goodGuy = new Character("Frank", 100, 100, 30, new Weapon("Sword", 5, 0.5));
		
		
		while (!monster.isDead() && !goodGuy.isDead()) {
			double whoGoes = randObj.nextDouble();			
			if (whoGoes < 0.5) {
				goodGuy.recordDamage(monster.doDamage());			
			}
			else {
				monster.recordDamage(goodGuy.doDamage());
			}
		}
		
		if (monster.isDead()) {
			System.out.println("Good Guy Wins!");
		}
		else {
			System.out.println("Monster Wins!");
		}
	}

}
