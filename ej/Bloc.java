package ej;

public abstract class Bloc implements IBloc{

	protected int length;
	protected int width;
	protected int height;
	protected Color color;
	
	public Bloc(final int length, final int width, final int height, final Color color) {
		this.length = length;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public final int getLong() {
		return length;
	}

	public final int getLargeur() {
		return width;
	}

	public final int getHauteur() {
		return height;
	}	
	
}