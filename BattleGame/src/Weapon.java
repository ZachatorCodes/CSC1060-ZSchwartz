
public class Weapon {
	private String name;
	private int range;
	private double damageFactor;
	
	public Weapon(String name, int range, double damageFactor) {
		super();
		this.name = name;
		this.range = range;
		this.damageFactor = damageFactor;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRange() {
		return range;
	}
	
	public void setRange(int range) {
		this.range = range;
	}
	
	public double getDamageFactor() {
		return damageFactor;
	}
	
	public void setDamageFactor(double damageFactor) {
		this.damageFactor = damageFactor;
	}
	
	public void swing() {
		
	}
	
	@Override
	public String toString() {
		return "Weapon [name=" + name + ", range=" + range + ", damageFactor=" + damageFactor + "]";
	}
}
