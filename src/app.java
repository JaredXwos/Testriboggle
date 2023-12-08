import java.util.Queue;
import java.util.concurrent.LinkedTransferQueue;

import figures.Figure;
import figures.OFigure;
import verifyFigure.TestResult;

public class app {
	public static Queue<Figure> readyqueue = new LinkedTransferQueue<Figure>();
	public static Queue<Figure> figurequeue = new LinkedTransferQueue<Figure>();
	public static Queue<TestResult> resultqueue = new LinkedTransferQueue<TestResult>();
	public static void main(String[] args) {
		Figure thing = new OFigure('r','a','t','e');
		System.out.println("NEXT");
		thing.print(0);System.out.println("NEXT");
		thing.print(1);System.out.println("NEXT");
		thing.print(2);System.out.println("NEXT");
		thing.print(3);System.out.println("NEXT");
		thing.print(4);System.out.println("NEXT");
		thing.print(5);System.out.println("NEXT");
		thing.print(6);System.out.println("NEXT");
		thing.print(7);
		
	}

}
