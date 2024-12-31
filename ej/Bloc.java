package ej;

public abstract class Bloc {

	private int longueur;
	private int largeur;
	private int hauteur;
	
	public Bloc(final int longueur, final int largeur, final int hauteur) {
		this.longueur = longueur;
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	public final int getLongueur() {
		return longueur;
	}

	public final int getLargeur() {
		return largeur;
	}

	public final int getHauteur() {
		return hauteur;
	}	
	
}