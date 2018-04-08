package JeuDeLOie_util;

public class Oie {

    private Couleur couleur;
    private Plateau plateauCourant;
    private Des des;
    private Case caseCourante;
    private Journal journal;

    private int toursBloque = 0;
    private boolean bloquee = false;


    public Oie(Couleur couleur, Plateau p, Des de) {
        this.couleur = couleur;
        plateauCourant = p;
        des = de;
        caseCourante = p.getFirstCase();
        journal = new Journal();
    }

    public int lancerDe() {
        return des.lancer();
    }

    public void ajouterMessage(String message) {
        journal.ajouterMessage(message);
    }

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

    public void setToursBloque(int val) {
        toursBloque = val;
    }

    public void setBloquee(boolean b) {
        bloquee = b;
    }

    public Couleur getCouleur() {
        return this.couleur;
    }

    public Plateau getPlateau() {
        return this.plateauCourant;
    }

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
