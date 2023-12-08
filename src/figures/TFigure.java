package figures;
public class TFigure extends TriangleFigure {

	public TFigure(char a, char b, char c, char d) {
		super(a, b, c, d);
		addtriangle(a,b,c);
		addtriangle(a,c,d);
		addfourth(a,b,c,d);
		addfourth(b,c,a,d);
	}

	@Override
	public void print(int seed) {
		switch(seed%8) {
		case 0:
			System.out.println("\t"+a+"\n\n"+b+"\t"+c+"\t"+d);break;
		case 1:
			System.out.println(""+b+"\t"+c+"\t"+d+"\n\n\t"+a);break;
		case 2:
			System.out.println("\t"+b+"\n\n"+a+"\t"+c+"\n\n\t"+d);break;
		case 3:
			System.out.println(""+b+"\n\n"+c+"\t"+a+"\n\n"+d);break;
		case 4:
			System.out.println(""+b+"\t"+a+"\n\n\t"+c+"\t"+d);break;
		case 5:
			System.out.println("\t"+a+"\t"+d+"\n\n"+b+"\t"+c);break;
		case 6:
			System.out.println(""+b+"\n\n"+a+"\t"+c+"\n\n\t"+d);break;
		case 7:
			System.out.println("\t"+b+"\n\n"+c+"\t"+a+"\n\n"+d);break;
		}
	}

}
