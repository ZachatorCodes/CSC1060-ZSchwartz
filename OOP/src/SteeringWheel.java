
public class SteeringWheel {
	private boolean isThreeSpoke;
	private String material;

	public SteeringWheel(boolean threeSpoke, String material) {
		this.isThreeSpoke = threeSpoke;
		this.material = material;
	}

	public boolean isThreeSpoke() {
		return isThreeSpoke;
	}

	public void setThreeSpoke(boolean isThreeSpoke) {
		this.isThreeSpoke = isThreeSpoke;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "SteeringWheel [isThreeSpoke=" + isThreeSpoke + ", material=" + material + "]";
	}

}
