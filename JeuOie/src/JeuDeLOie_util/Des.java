package JeuDeLOie_util;

import java.time.LocalTime;
import java.util.Random;

public class Des {
    private Random rand;
    private Mode mode;

    /**
     * Constructeur de Des, initalise le random a la nanoseconde, et le mode à un de6
     */
    public Des() {
        rand = new Random(LocalTime.now().getNano());
        mode = Mode.UNDE6;
    }

    /**
     * Constructeur de Des, initalise le random a la nanoseconde, et le mode au mode passéen param
     * @param mode
     */
    public Des(Mode mode) {
        rand = new Random(LocalTime.now().getNano());
        this.mode = mode;
    }

    /**
     * @return nombre aleatoire entre 1 et 6 compris
     */
    int lancer() {
        switch(mode) {
            case DEUXDE6:
                return rand.nextInt(6) + rand.nextInt(6) + 2 ;
            case UNDE12:
                return rand.nextInt(12) + 1;
            default :
                return rand.nextInt(6) + 1;
        }

    }

    public enum Mode {
        UNDE6,
        DEUXDE6,
        UNDE12;
    }
}
