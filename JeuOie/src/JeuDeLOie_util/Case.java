package JeuDeLOie_util;

public class Case {

    private int numCase;

    /**
     * Constructeur de Case
     * @param numCase
     */

    public Case(int numCase){
        this.numCase = numCase;
    }

    /**
     * @return " numero x"
     */
    public String getNom() {
        return " numero " + numCase;
    }

}
