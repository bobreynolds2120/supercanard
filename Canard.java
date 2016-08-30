package headfirst.chapitre1.supercanard;

import headfirst.chapitre1.supercanard.comportement.ComportementCancan;
import headfirst.chapitre1.supercanard.comportement.ComportementVol;

public abstract class Canard {
	protected ComportementVol comportementVol;
	protected ComportementCancan comportementCancan;
	
	public Canard() {
		
	}
	
	public abstract void afficher();
	
	public void setComportementVol(ComportementVol cv) {
		this.comportementVol = cv;
	}
	
	public void setComportementCancan(ComportementCancan cc) {
		this.comportementCancan = cc;
	}
	
	public void effectuerVol() {
		comportementVol.voler();
	}
	
	public void effectuerCancan() {
		comportementCancan.cancaner();
	}
	
	public void nager() {
		System.out.println("Je suis un canard et je nage.");
	}
	
}
