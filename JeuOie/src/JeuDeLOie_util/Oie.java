package JeuDeLOie_util;

public class Oie {

    private Couleur couleur;
    private Plateau plateauCourant;
    private Des des;
    private Case caseCourante;
    private Journal journal;

    private int toursBloque = 0;
    private boolean bloquee = false;

    /**
     * Constructeur de Oie, intialise aussi caseCourant et journal.
     * @param couleur
     * @param p
     * @param de
     */
    public Oie(Couleur couleur, Plateau p, Des de) {
        this.couleur = couleur;
        plateauCourant = p;
        des = de;
        caseCourante = p.getFirstCase();
        journal = new Journal();
    }

    /**
     * @return Le resultat d'un lancer de des (dépend de l'initialisation)
     */
    public int lancerDe() {
        return des.lancer();
    }

    /**
     * ajoute un message au journal de l'Oie
     * @param message
     */
    public void ajouterMessage(String message) {
        journal.ajouterMessage(message);
    }

    /**
     * L'Oie joue un tour
     * @return si la partie est finie après ce tour
     */
    public boolean action() {
        if (toursBloque != 0 ) {
            ajouterMessage("L'oie " + this.getCouleur() + " est bloquee pour " + toursBloque-- + " tours");
            journal.afficherMessage();
            return false;
        } else if( bloquee ) {
            ajouterMessage("L'oie " + this.getCouleur() + " est bloquee !");
            journal.afficherMessage();
            return false;
        }

        caseCourante.depart(this);
        int valeurDes = lancerDe();
        ajouterMessage(" elle fait " + valeurDes);
        caseCourante = caseCourante.caseSuivante(this, caseCourante.getNumCase() + valeurDes);

        if (caseCourante != null) {
            caseCourante = caseCourante.arrive(this);
            journal.afficherMessage();
            return false;
        } else {
            ajouterMessage(" elle va sur la case Jardin et gagne !");
            journal.afficherMessage();
            return true;
        }
    }

    /**
     * Setteur du nombre de tours à passer bloquee
     * @param val
     */
    public void setToursBloque(int val) {
        toursBloque = val;
    }

    /**
     * Setteur du bloquage pour un temps indéfini
     * @param b
     */
    public void setBloquee(boolean b) {
        bloquee = b;
    }

    /**
     * Getteur de la couleur de l'Oie
     * @return couleur
     */
    public Couleur getCouleur() {
        return this.couleur;
    }

    /**
     * Getteur du plateau de l'Oie
     * @return plateau
     */
    public Plateau getPlateau() {
        return this.plateauCourant;
    }

    /**
     * Différentes couleurs possibles pour l'Oie
     */
    public enum Couleur{
        Rouge,
        Bleue,
        Jaune,
        Verte,
        Orange,
        Magenta,
        Violette,
        Cyan,
        Pourpre,
        Cramoisie,
        Rose,
        Grise,
        Emeraude,
        Jais,
        Blanche;
    };
}
