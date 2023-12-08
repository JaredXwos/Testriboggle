package figures;
import java.util.HashSet;
import java.util.Set;

public abstract class Figure {
	protected char a;
	protected char b;
	protected char c;
	protected char d;
	public Set<String> combinations = new HashSet<String>();
	public Figure(char a, char b, char c, char d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public abstract void print(int seed);
	public final void addboth(String word) {
		combinations.add(word);
		combinations.add(new StringBuilder(word).reverse().toString());
	}
}	
