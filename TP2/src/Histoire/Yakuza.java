package Histoire;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;
	
	
	/**
	 * @param argent
	 * @param boisson
	 * @param nom
	 * @param clan
	 */
	public Yakuza(int argent, String boisson, String nom, String clan) {
		super(argent, boisson, nom);
		this.clan = clan;
		this.reputation = 0;
	}

	/**
	 * @param c
	 */
	public void extorquer(Commercant c) {
		gagnerArgent(c.seFaireExtorquer());
	}
	
	/**
	 * gagner un duel 
	 */
	public void gagner() {
		parler("J'ai gagné en duel !");
		++reputation;
	}
	
	/* (non-Javadoc)
	 * @see Histoire.Humain#direBonjour()
	 */
	public void direBonjour( ) {
		super.direBonjour();
		parler("Ah et j'appartiens aux " + clan);
	}

	/**
	 * @return argent perdu
	 */
	public int perdre() {
		int a = argent;
		parler("J'ai perdu...");
		perdreArgent(a);
		--reputation;
		return a;
	}
	
	/**
	 * @return clan
	 */
	public String getClan() {
		return clan;
	}


	/**
	 * @return reputation
	 */
	public int getReputation() {
		return reputation;
	}
	
}
