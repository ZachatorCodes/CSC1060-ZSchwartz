import java.util.Random;

public class Character {
	private String name;
	private double health;
	private int strength;
	private int speed;
	private Weapon weapon;
	private Random rand = new Random();
	
	public Character(String name, double health, int strength, int speed, Weapon weapon) {
		super();
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.speed = speed;
		this.weapon = weapon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public double doDamage() {
		double rng = rand.nextDouble();
		double damage = rng * weapon.getDamageFactor() * strength;
		return damage;
	}
	
	public void recordDamage(double damage) {
		health -= damage;
		if (health < 0) {
			health = 0;
		}
	}
	
	public boolean isDead() {
		return health <= 0;
	}

	@Override
	public String toString() {
		return "Character [name=" + name + ", health=" + health + ", strength=" + strength + ", speed=" + speed
				+ ", weapon=" + weapon + "]";
	}
}
