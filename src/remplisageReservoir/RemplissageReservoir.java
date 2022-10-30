package remplisageReservoir;
import reservoir.Reservoir1;
import reservoir.Reservoir2;
import reservoir.Reservoir3;

public class RemplissageReservoir {
	
	public static void main(String[] args) {
		
		Reservoir1 R1 = new Reservoir1();
		Reservoir2 R2 = new Reservoir2();
		Reservoir3 R3 = new Reservoir3();
		
		R1.remplir(25, 1500);
		R2.remplir(12, 750);
		R3.remplir(25, 1500);
		
		System.out.println(R1);
		System.out.println(R2);
		System.out.println(R3);
	}

}
