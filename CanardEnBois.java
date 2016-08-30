package headfirst.chapitre1.supercanard;

import headfirst.chapitre1.supercanard.comportement.instanciationVol.NePasVoler;
import headfirst.chapitre1.supercanard.comportement.instnaciationCancan.CancanDeBois;

public class CanardEnBois extends Canard {

	public CanardEnBois() {
		super();
		comportementCancan = new CancanDeBois();
		comportementVol = new NePasVoler();
	}
	
	@Override
	public void afficher() {
		
		System.out.println("Je suis un canard en bois. Je suis telement enuyant que je donne aux gens l'envi de se suicider.");
	}
	
}
