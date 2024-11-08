
public class Weather {
	private boolean lightning;
	private int rainForce;
	
	public Weather(boolean lightning, int rainForce) {
		super();
		this.lightning = lightning;
		this.rainForce = rainForce;
	}

	public boolean isLightning() {
		return lightning;
	}

	public void setLightning(boolean lightning) {
		this.lightning = lightning;
	}

	public int getRainForce() {
		return rainForce;
	}

	public void setRainForce(int rainForce) {
		this.rainForce = rainForce;
	}

	@Override
	public String toString() {
		return "Weather [lightning=" + lightning + ", rainForce=" + rainForce + "]";
	}
}
