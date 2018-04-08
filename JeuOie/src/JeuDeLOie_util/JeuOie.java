package JeuDeLOie_util;

public class JeuOie {
    private Oie[] oies;
    private int nbOie = 0;
    private Plateau plateau = new Plateau(63);
    private Des des = new Des();


    public JeuOie(int nbOieMax) {
        oies = new Oie[nbOieMax];
    }

    public void ajouterOie(Oie.Couleur couleur) {
        if (nbOie < oies.length) {
            oies[nbOie] = new Oie(couleur, plateau, des);
            nbOie++;
        }
    }

    public void jouer() {
        boolean finPartie = false;
        int i = 0;

        while(!finPartie) {
            finPartie = oies[i].action();
            i = (i+1)%nbOie;
        }
    }
}