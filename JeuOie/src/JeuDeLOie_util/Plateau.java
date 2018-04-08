package JeuDeLOie_util;

public class Plateau {

    final public int NB_CASES;
    private Case[] cases;

    /**
     * Constructeur de plateau
     * @param nbCases
     */
    public Plateau(int nbCases) {
        NB_CASES = nbCases;
        cases = new Case[nbCases];
        for(int i=0;i<nbCases-1;++i) {
            cases[i] = new Case(i);
        }
        cases[NB_CASES-1] = null;
    }

    /**
     * @note similaire a getCase(0);
     * @return la premiere case du plateau
     */
    public Case getFirstCase() {
        return cases[0];
    }

    /**
     * @param i
     * @return la ieme case ou la derniere si i trop grand
     */
    public Case getCase(int i) {
        if(i>=NB_CASES) {
            System.err.println("Nombre trop grand dans getCase");
            return cases[NB_CASES-1];
        }
        return cases[i];
    }

}
