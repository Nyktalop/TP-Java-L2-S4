package JeuDeLOie_util;

public class JeuOie {
    private Oie[] oies;
    private int nbOie = 0;
    private Plateau plateau = new Plateau(63);
    private Des des = new Des();

    public JeuOie(int nbOieMax) {
        oies = new Oie[nbOieMax];
    }

    public void ajouterOie(String couleur) {
        if (nbOie < oies.length) { oies[nbOie] = new Oie(couleur, plateau, des);
            nbOie++;
        }
    }

    public void jouer() {
    }
}