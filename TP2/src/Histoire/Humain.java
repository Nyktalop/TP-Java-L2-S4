package Histoire;

public class Humain {
	protected int argent;
	protected String boisson;
	protected String nom;
	
	/**
	 * @param argent
	 * @param boisson
	 * @param nom
	 */
	public Humain(int argent, String boisson, String nom) {
		this.argent = argent;
		this.boisson = boisson;
		this.nom = nom;
	}

	public void boire() {
		parler("Ahhh, un bon verre de" + boisson);
	}
	
	/**
	 * @param texte
	 */
	public void parler(String texte) {
		System.out.println( "(" + this.nom +") " + texte);
	}
	
	/**
	 * Says hello.
	 */
	public void direBonjour() {
		this.parler("Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boisson);
	}
	
	/**
	 * @param argent
	 */
	public void perdreArgent(int argent) {
		this.argent -= argent;
	}

	/**
	 * @param argent
	 */
	public void gagnerArgent(int argent) {
		this.argent += argent;
	}
	
	/**
	 * @return argent
	 */
	public int getArgent() {
		return argent;
	}

	/**
	 * @return boisson
	 */
	public String getBoisson() {
		return boisson;
	}

	/**
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}
		
}
