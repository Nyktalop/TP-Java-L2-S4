package JeuDeLOie_util;

public class Case {

    private int numCase;
    private Oie oieBloquee;

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
        int num = numCase + 1;
        return " numero " + num;
    }

    /**
     * Getteur du numero de la case
     * @return numCase
     */
    public int getNumCase() {
        return this.numCase;
    }

    /**
     * Gère l'arrive d'une oie sur une case
     * @param oie
     * @return la case ou l'oie fini
     */
    public Case arrive(Oie oie) {
        switch(this.numCase + 1) {
            case 9 :
            case 18 :
            case 27 :
            case 36 :
            case 45 :
            case 54 :
                int valeur = oie.lancerDe();
                oie.ajouterMessage(" elle va sur la case" + this.getNom() + " une case relance !");
                oie.ajouterMessage(" Elle relance les des : elle fait " + valeur);
                Case c = caseSuivante(oie,numCase + valeur);
                return c.arrive(oie);
            case 42 :
                oie.ajouterMessage(" elle va sur");
                oie.ajouterMessage(" le labyrinthe, elle retourn case 30");
                return oie.getPlateau().getCase(30);
            case 58 :
                oie.ajouterMessage(" elle va sur");
                oie.ajouterMessage(" la mort, elle retourne case 1");
                return oie.getPlateau().getFirstCase();
            case 19 :
                oie.ajouterMessage(" elle va sur l'hotel, elle est bloquee 2 tours ");
                oie.setToursBloque(2);
                return this;
            case 31 :
            case 52 :
                if (this.numCase + 1 == 31) {
                    oie.ajouterMessage(" elle va sur le puit");
                } else {
                    oie.ajouterMessage(" elle va sur la prison");
                }
                if( oieBloquee != null ) {
                    oie.ajouterMessage(" elle libere l'oie " + oieBloquee.getCouleur());
                    oieBloquee.setBloquee(false);
                    oieBloquee = null;
                } else {
                    oie.ajouterMessage(" elle est bloquee !");
                    oieBloquee = oie;
                    oie.setBloquee(true);
                }
                return this;
            default :
                oie.ajouterMessage(" elle va sur la case" + this.getNom());
                return this;
        }
    }

    /**
     * Deplace l'oie sur une autre case, l'oie revient en arrière si elle depasse le max
     * @param oie
     * @param numCaseDestination
     * @return
     */
    public Case caseSuivante(Oie oie, int numCaseDestination){
        int dest = numCaseDestination >= oie.getPlateau().NB_CASES ? oie.getPlateau().NB_CASES*2 - numCaseDestination - 2   : numCaseDestination;

        return oie.getPlateau().getCase(dest);
    }

    /**
     * Genere le log de depart d'une case
     * @param oie
     * @return
     */
    public Case depart(Oie oie) {
        oie.ajouterMessage("L'oie " + oie.getCouleur() + " est sur la case" + this.getNom());
        return this;
    }

}
