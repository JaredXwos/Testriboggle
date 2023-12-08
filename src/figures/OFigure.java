package figures;
import java.util.ArrayList;
import java.util.List;

public class OFigure extends TriangleFigure {

	public OFigure(char a, char b, char c, char d) {
		super(a, b, c, d);
		addtriangle(a,b,c);
		addtriangle(a,b,d);
		addtriangle(a,c,d);
		addtriangle(b,c,d);
		List<Character> three = new ArrayList<Character>();
		three.add(b); three.add(c); three.add(d);
		for(Character bridge: new ArrayList<Character>(three)) {
			three.remove(bridge);
			addfourth(three.get(0),three.get(1),bridge,a);
			addfourth(three.get(0),three.get(1),a,bridge);
			three.add(bridge);
		}
	}

	@Override
	public void print(int seed) {
		System.out.println(""+a+"\t"+b+"\n\n"+c+"\t"+d);
	}

}
