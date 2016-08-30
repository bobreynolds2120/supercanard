package headfirst.chapitre1.supercanard;

import headfirst.chapitre1.supercanard.comportement.instanciationVol.VolerAvecDesAiles;
import headfirst.chapitre1.supercanard.comportement.instnaciationCancan.Cancan;

public class Colvert extends Canard {
	
	public Colvert() {
		super();
		comportementCancan = new Cancan();
		comportementVol = new VolerAvecDesAiles();
	}
	
	@Override
	public void afficher() {
		System.out.println("Je suis un colvert. J'ai le col vert.");
	}
	
}
