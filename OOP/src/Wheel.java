
public class Wheel {
	private String wheelMaterial;
	private int wheelRadius;
	
	public Wheel(String wheelMaterial, int wheelRadius) {
		super();
		this.wheelMaterial = wheelMaterial;
		this.wheelRadius = wheelRadius;
	}

	public String getWheelMaterial() {
		return wheelMaterial;
	}

	public void setWheelMaterial(String wheelMaterial) {
		this.wheelMaterial = wheelMaterial;
	}

	public int getWheelRadius() {
		return wheelRadius;
	}

	public void setWheelRadius(int wheelRadius) {
		this.wheelRadius = wheelRadius;
	}

	@Override
	public String toString() {
		return "Wheel [wheelMaterial=" + wheelMaterial + ", wheelRadius=" + wheelRadius + "]";
	}
	
}
