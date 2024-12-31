package ej.blocs;

import ej.IllegalBlocException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Bloc implements IBloc {

	protected int length;
	protected int width;
	protected int height;
	protected Color color;

	private static Logger logger = LogManager.getLogger(Bloc.class);

	public Bloc (final int length, final int width, final int height) throws IllegalBlocException {
		if(length < MIN_LENGTH || width < MIN_WIDTH || height < MIN_HEIGHT)
			throw new IllegalBlocException();
			
		this.length = length;
		this.width = width;
		this.height = height;

		logger.info("Bloc created with length: " + length + " width: " + width + " height: " + height);
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