package generateFigure;

import java.util.ArrayList;
import java.util.List;

import figures.Figure;
import figures.IFigure;
import figures.LFigure;
import figures.OFigure;
import figures.TFigure;

public class DiceFigureGenerator implements FigureGenerator {
	private final Randint randint = Randint.INSTANCE;
	private List<char[]> dices = new ArrayList<char[]>();
	private final List<char[]> alldice;
	public DiceFigureGenerator(char[]... dices ) {
		for(char[] dice: dices) this.dices.add(dice);
		alldice = new ArrayList<char[]>(this.dices);
	}
	@Override
	public Figure nextfigure() {
		Figure next = null;
		char[][] selection = new char[dices.size()][6];
		for(int i=0;i<4;i++) selection[i] = dices.remove(randint.get()%dices.size());
		char a = selection[0][randint.get()%6];
		char b = selection[1][randint.get()%6];
		char c = selection[2][randint.get()%6];
		char d = selection[3][randint.get()%6];
		switch(randint.get()%4) {
		case 0: next = new IFigure(a,b,c,d); break;
		case 1: next = new LFigure(a,b,c,d); break;
		case 2: next = new OFigure(a,b,c,d); break;
		case 3: next = new TFigure(a,b,c,d); break;
		}
		dices = new ArrayList<char[]>(alldice);
		assert next == null;
		return next;
	}

}
