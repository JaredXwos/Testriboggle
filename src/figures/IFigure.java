package figures;
public class IFigure extends Figure {

	public IFigure(char a, char b, char c, char d) {
		super(a, b, c, d);
		addboth(""+a+b+c);
		addboth(""+b+c+d);
		addboth(""+a+b+c+d);
	}

	@Override
	public void print(int seed) {
		System.out.println(
			(seed%2==0)?
			""+a+"\t"+b+"\t"+c+"\t"+d:
			""+a+"\n\n"+b+"\n\n"+c+"\n\n"+d
		);
	}

}
