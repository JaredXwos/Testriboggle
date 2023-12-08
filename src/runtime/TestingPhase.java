package runtime;

import java.util.Queue;
import java.util.concurrent.LinkedTransferQueue;

import figures.Figure;
import generateFigure.Randint;
import verifyFigure.FigureVerifier;
import verifyFigure.TestResult;

public class TestingPhase {
	private static final Randint random = Randint.INSTANCE;
	public static Queue<TestResult> test(Queue<Figure> figurequeue,FigureVerifier verifier){
		return test(figurequeue,verifier,0);
	}
	public static Queue<TestResult> test(Queue<Figure> figurequeue,FigureVerifier verifier, int verbose) {
		Queue<TestResult> resultqueue = new LinkedTransferQueue<TestResult>();
		for(Figure figure:figurequeue) {
			figure.print(random.get());
			resultqueue.add(verifier.verify(figure));
			switch(verbose) {
			case 1:
				
			default: break;
			}
		}
		return resultqueue;
	}
}
