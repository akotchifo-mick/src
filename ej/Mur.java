package ej;

public class Mur extends Bloc {

	private boolean holds;
	
	public Mur(final int length, final int width, final int height, final boolean holds) {
		super(length, width, height);
		this.holds = holds;
	}

	public boolean canPassThrough() {
		return !holds;
	}	

}
