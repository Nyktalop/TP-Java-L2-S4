package JeuDeLOie_util;

public class Journal {
    private String message;

    /**
     * Constructeur de Journal
     */
    public Journal() {
        message = "";
    }

    /**
     * ajoute un message dans le message a afficher
     * @param message
     */
    public void ajouterMessage(String message) {
        this.message += message;
    }

    /**
     * affiche et reinitilise le message
     */
    public void afficherMessage() {
        System.out.println(message);
        message = "";
    }
}
