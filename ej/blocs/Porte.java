package ej.blocs;

import ej.IllegalBlocException;
import ej.PorteLockedException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Porte extends Bloc {
    private boolean locked;

    private static final Logger logger = LogManager.getLogger(Porte.class);

    public Porte(final int longueur, final int largeur, final int hauteur, final boolean locked) throws IllegalBlocException {
        super(longueur, largeur, hauteur);
        this.locked = locked;

        logger.info("Porte created with length: " + longueur + " width: " + largeur + " height: " + hauteur + " locked: " + locked);
    }

    public boolean isLocked() {
        return locked;
    }

    public void lock() throws PorteLockedException {
        if(!locked) {
            this.locked = true;        
        }
        else throw new PorteLockedException();        
    }
}
