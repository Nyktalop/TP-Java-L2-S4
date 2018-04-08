package JeuDeLOie_util;

public class JeuOie {
    private Oie[] oies;
    private int nbOie = 0;
    private Plateau plateau = new Plateau(63);
    private Des des;

    /**
     * Constructeur de JeuOie, intialise les des à un dé 6
     * @param nbOieMax
     */
    public JeuOie(int nbOieMax) {
        oies = new Oie[nbOieMax];
        des = new Des();
    }

    /**
     * Contructeur auxiliaire de JeuOie, initialise les des à mode
     * @param nbOieMax
     * @param mode
     */
    public JeuOie(int nbOieMax, Des.Mode mode ) {
        oies = new Oie[nbOieMax];
        des = new Des(mode);
    }

    /**
     * Ajoute une oie au jeu avant de le lancer
     * Utilise l'enum couleur définie dans la classe Oie
     * @param couleur
     */
    public void ajouterOie(Oie.Couleur couleur) {
        if (nbOie < oies.length) {
            oies[nbOie] = new Oie(couleur, plateau, des);
            nbOie++;
        }
    }

    /**
     * Lance le jeu en donnant la main à chaque oie chacune leur tour jusqu'a la fin
     */
    public void jouer() {
        boolean finPartie = false;
        int i = 0;

        if(nbOie == 0 ) return;
        while(!finPartie) {
            finPartie = oies[i].action();
            i = (i+1)%nbOie;
        }
    }
}