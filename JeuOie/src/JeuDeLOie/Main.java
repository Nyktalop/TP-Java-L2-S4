package JeuDeLOie;

import JeuDeLOie_util.*;

public class Main {

    public static void main(String[] args) {
        JeuOie jeu = new JeuOie(6);

        jeu.ajouterOie(Oie.Couleur.Cramoisie);
        jeu.ajouterOie(Oie.Couleur.Jais);
        jeu.ajouterOie(Oie.Couleur.Pourpre);
        jeu.ajouterOie(Oie.Couleur.Cyan);
        jeu.ajouterOie(Oie.Couleur.Emeraude);
        jeu.ajouterOie(Oie.Couleur.Magenta);

        jeu.jouer();
    }
}
