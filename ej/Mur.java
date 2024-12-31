package ej;

public class Mur extends Bloc {

	private boolean holds;
	
	public Mur(final int longueur, final int largeur, final int hauteur, final boolean holds) {
		super(longueur, largeur, hauteur);
		this.holds = holds;
	}

	public boolean canPassThrough() {
		return !holds;
	}	

}
