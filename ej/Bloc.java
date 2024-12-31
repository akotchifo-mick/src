package ej;

public abstract class Bloc implements IBloc{

	protected int length;
	protected int width;
	protected int height;
	protected Color color;
	
	public Bloc(final int length, final int width, final int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public final int getLength() {
		return length;
	}

	public final int getWidth() {
		return width;
	}

	public final int getHeight() {
		return height;
	}	

	public final void setColor(Color newColor) {
		this.color = newColor;
	}
	
}