package Histoire;

public class Commercant extends Humain {
	
	/**
	 * @param argent
	 * @param nom
	 */
	public Commercant(int argent, String nom) {
		super(argent,"Th�",nom);
	}
	
	/**
	 * Commer�ant perd 10
	 */
	public int seFaireExtorquer() {
		int a = argent;
		perdreArgent(argent);
		parler("Oh non j'ai perdu " + a);
		return a;
	}
	
	/**
	 * @param argent
	 */
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler("Oh merci !");
	}
	
}
