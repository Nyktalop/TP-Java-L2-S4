package JeuDeLOie_util;

import java.time.LocalTime;
import java.util.Random;

public class Des {
    private Random rand;

    /**
     * Constructeur de Des, initalise le random a la nanoseconde
     */
    public Des() {
        rand = new Random(LocalTime.now().getNano());
    }

    /**
     * @return nombre aleatoire entre 1 et 6 compris
     */
    int lancer() {
        return rand.nextInt(6)+1;
    }
}
