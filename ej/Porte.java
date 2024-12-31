package ej;

public class Porte extends Bloc {
    private boolean locked;

    public Porte(final int longueur, final int largeur, final int hauteur, final boolean locked) throws IllegalBlocException {
        super(longueur, largeur, hauteur);
        this.locked = locked;
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
