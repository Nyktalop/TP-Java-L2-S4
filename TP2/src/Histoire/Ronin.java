package Histoire;

public class Ronin extends Humain {
	int honneur;
	
	/**
	 * @param argent
	 * @param boisson
	 * @param nom
	 */
	public Ronin(int argent, String boisson, String nom) {
		super(argent, boisson, nom);
		honneur = 1;
	}

	/**
	 * @param c
	 * @param argent
	 */
	public void donner(Commercant c, int argent) {
		c.recevoir(argent);
	}
	
	/**
	 * @param y
	 */
	public void provoquer(Yakuza y) {
		if((honneur*2)>y.getReputation()) {
			gagnerArgent(y.perdre());
			++honneur;
		} else {
			parler("Oh non j'ai paredu...");
			--honneur;
		}
	}
	
}
