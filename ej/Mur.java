package ej;

public class Mur extends Bloc {

	private boolean holds;
	
	public Mur(final int length, final int width, final int height, final boolean holds, final Color color) {
		super(length, width, height, color);
		this.holds = holds;
	}

	public boolean canPassThrough() {
		return !holds;
	}	

}
