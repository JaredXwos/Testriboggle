package figures;
public class LFigure extends TriangleFigure {

	public LFigure(char a, char b, char c, char d) {
		super(a, b, c, d);
		addtriangle(a,b,c);
		addfourth(a,b,c,d);
	}

	@Override
	public void print(int seed) {
		switch(seed%8) {
		case 0:
			System.out.println(""+a+"\n\n"+b+"\t"+c+"\t"+d);break;
		case 1:
			System.out.println(""+b+"\t"+c+"\t"+d+"\n\n"+a);break;
		case 2:
			System.out.println(""+d+"\t"+c+"\t"+b+"\n\n\t\t"+a);break;
		case 3:
			System.out.println(""+"\t\t"+a+"\n\n"+d+"\t"+c+"\t"+b);break;
		case 4:
			System.out.println(""+b+"\t"+a+"\n\n"+c+"\n\n"+d);break;
		case 5:
			System.out.println(""+a+"\t"+b+"\n\n\t"+c+"\n\n\t"+d);break;
		case 6:
			System.out.println(""+d+"\n\n"+c+"\n\n"+b+"\t"+a);break;
		case 7:
			System.out.println("\t"+d+"\n\n\t"+c+"\n\n"+a+"\t"+b);break;
		}
	}

}
