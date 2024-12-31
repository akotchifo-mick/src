package ej.blocs;

import ej.IllegalBlocException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Mur extends Bloc {
	private boolean holds;

	private static Logger logger = LogManager.getLogger(Mur.class);
	
	public Mur(final int length, final int width, final int height, final boolean holds) throws IllegalBlocException {
		super(length, width, height);
		this.holds = holds;

		logger.info("Mur created with length: " + length + " width: " + width + " height: " + height + " holds: " + holds);
	}

	public boolean canPassThrough() {
		return !holds;
	}	

}
