package reservoir;

public class Reservoir1 {
	
	private double longeurMax = 15.25;
	private double LargeurMax = 7.25;
	private double hauteurMaax = 2.35;
	private double litreKeroseneMax;
	private double litreKeroseneAjouter = 0;
	
	private double dimensioMax;

	public Reservoir1() {
		this.dimensioMax = this.longeurMax * this.LargeurMax * this.hauteurMaax;
		this.litreKeroseneMax = (this.dimensioMax)/(0.001);
	}
	
	public double getDimensioMax() {
		return dimensioMax;
	}
	
	public void setDimensioMax(double dimensioMax) {
		this.dimensioMax = dimensioMax;
	}
	public double getLitreKeroseneMax() {
		return litreKeroseneMax;
	}
	public void setLitreKeroseneAjouter(double litreKeroseneAjouter) {
		this.litreKeroseneAjouter = litreKeroseneAjouter;
	}
	
	public void remplir(int litreParInjection,int seuilLimite) {
		while((this.litreKeroseneAjouter + litreParInjection) < getLitreKeroseneMax() && this.litreKeroseneAjouter < seuilLimite-litreParInjection) {
			
			setLitreKeroseneAjouter(litreParInjection+this.litreKeroseneAjouter);
		}
		
		
	}

	@Override
	public String toString() {
		return "Reservoir1 [longeurMax=" + longeurMax + ", LargeurMax=" + LargeurMax + ", hauteurMaax=" + hauteurMaax
				+ ", litreKeroseneMax=" + litreKeroseneMax + ", litreKeroseneAjouter=" + litreKeroseneAjouter
				+ ", dimensioMax=" + dimensioMax + "]";
	}
	
}
