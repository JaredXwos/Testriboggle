package generateFigure;

import java.util.ArrayList;
import java.util.List;

import figures.Figure;
import figures.IFigure;
import figures.LFigure;
import figures.OFigure;
import figures.TFigure;

public class ListFigureGenerator implements FigureGenerator {
	private final Randint randint = Randint.INSTANCE;
	private List<Character> sample = new ArrayList<Character>();
	private final List<Character> fullsample;
	public ListFigureGenerator(char... sample) {
		for(Character letter: sample) this.sample.add(letter);
		fullsample = new ArrayList<Character>(this.sample);
	}
	@Override
	public Figure nextfigure() {
		Figure next = null;
		char a = sample.remove(randint.get()%sample.size());
		char b = sample.remove(randint.get()%sample.size());
		char c = sample.remove(randint.get()%sample.size());
		char d = sample.remove(randint.get()%sample.size());
		switch(randint.get()%4) {
		case 0: next = new IFigure(a,b,c,d); break;
		case 1: next = new LFigure(a,b,c,d); break;
		case 2: next = new OFigure(a,b,c,d); break;
		case 3: next = new TFigure(a,b,c,d); break;
		}
		sample = new ArrayList<Character>(this.fullsample);
		assert(next!=null);
		return next;
	}

}
