package generateFigure;

import java.util.Random;

public enum Randint {
	INSTANCE;
	private final Random random = new Random();
	public int get() {
		return random.nextInt();
	}
}
