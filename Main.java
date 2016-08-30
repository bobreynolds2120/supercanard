package headfirst.chapitre1.supercanard;

public class Main {

	public static void main(String[] args) {
		Colvert colvert = new Colvert();
		
		colvert.afficher();
		colvert.effectuerCancan();
		colvert.effectuerVol();
		colvert.nager();
		
		CanardEnBois canardEnBois = new CanardEnBois();
		
		canardEnBois.afficher();
		canardEnBois.effectuerCancan();
		canardEnBois.effectuerVol();
		canardEnBois.nager();
	}

}
