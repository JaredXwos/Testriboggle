package figures;
public abstract class TriangleFigure extends Figure {

	public TriangleFigure(char a, char b, char c, char d) {
		super(a, b, c, d);
	}

	@Override
	public abstract void print(int seed);
	
	public final void addtriangle(char x, char y, char z) {
		addboth(""+z+y+x);
		addboth(""+x+z+y);
		addboth(""+y+x+z);
	}
	public final void addfourth(char x, char y, char z, char a) {
		addboth(""+x+y+z+a);
		addboth(""+y+x+z+a);
	}
}
