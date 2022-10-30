package pilotes;

public class Eleve extends Pilote{
	
	protected Eleve(String nom,int age,int nombreVole,int passAb) {
		super(nom,age,nombreVole);
		super.passAb = passAb;
	}
	
	
	@Override
	public String toString() {
		String etatEleve = super.toString();
		return super.nom + etatEleve.substring(0,etatEleve.length()-1) +"]";
	}
	public static void main(String[] args) {
		Eleve e1 = new Eleve("Jean",28,500,150);
		System.out.println(e1);
		
	}
	
}
