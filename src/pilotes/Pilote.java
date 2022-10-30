package pilotes;

public class Pilote {
	
	protected String nom;
	protected int age;
	protected int nombreVole;
	protected int passAb=0; 
	
	protected Pilote(String nom, int age, int nombreVole) {
		
		//super();
		
		this.nom = nom;
		this.age = age;
		this.nombreVole = nombreVole;
	}

	@Override
	public String toString() {
		return "Pilote [nom=" + nom + ", age=" + age + ", nombreVole=" + nombreVole + ", passAb=" + passAb + "]";
	}

	protected String getNom() {
		return nom;
	}

	protected int getAge() {
		return age;
	}

	protected int getNombreVole() {
		return nombreVole;
	}

	protected int getPassAb() {
		return passAb;
	}

	
}
