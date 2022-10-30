package moteur;

public class Moteur {
	
	private int allumage;
	private float pressionHuile;
	private float capteurTemperatureMax;
	private float capteurTemperatureMin; 
	private float capteurPressionHuile;
	
	@Override
	public String toString() {
		return "Moteur [allumage=" + allumage + ", pressionHuile=" + pressionHuile + ", capteurTemperatureMax="
				+ capteurTemperatureMax + ", capteurTemperatureMin=" + capteurTemperatureMin + ", capteurPressionHuile="
				+ capteurPressionHuile + ", getAllumage()=" + getAllumage() + ", getPressionHuile()="
				+ getPressionHuile() + ", getCapteurTemperatureMax()=" + getCapteurTemperatureMax()
				+ ", getCapteurTemperatureMin()=" + getCapteurTemperatureMin() + ", getCapteurPressionHuile()="
				+ getCapteurPressionHuile() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public Moteur(int allumage, float pressionHuile, float capteurTemperatureMax, float capteurTemperatureMin,
			float capteurPressionHuile) {
		super();
		this.allumage = allumage;
		this.pressionHuile = pressionHuile;
		this.capteurTemperatureMax = capteurTemperatureMax;
		this.capteurTemperatureMin = capteurTemperatureMin;
		this.capteurPressionHuile = capteurPressionHuile;
	}
	public int getAllumage() {
		return allumage;
	}
	public void setAllumage(int allumage) {
		this.allumage = allumage;
	}
	public float getPressionHuile() {
		return pressionHuile;
	}
	public void setPressionHuile(float pressionHuile) {
		this.pressionHuile = pressionHuile;
	}
	public float getCapteurTemperatureMax() {
		return capteurTemperatureMax;
	}
	public void setCapteurTemperatureMax(float capteurTemperatureMax) {
		this.capteurTemperatureMax = capteurTemperatureMax;
	}
	public float getCapteurTemperatureMin() {
		return capteurTemperatureMin;
	}
	public void setCapteurTemperatureMin(float capteurTemperatureMin) {
		this.capteurTemperatureMin = capteurTemperatureMin;
	}
	public float getCapteurPressionHuile() {
		return capteurPressionHuile;
	}
	public void setCapteurPressionHuile(float capteurPressionHuile) {
		this.capteurPressionHuile = capteurPressionHuile;
	}
	
}
