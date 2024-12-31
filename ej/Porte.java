package ej;

public class Porte extends Bloc {
    private boolean locked;

    public Porte(final int longueur, final int largeur, final int hauteur, final boolean locked) {
        super(longueur, largeur, hauteur);
        this.locked = locked;
    }

    public boolean isLocked() {
        return locked;
    }
}
