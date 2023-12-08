package verifyFigure;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import figures.Figure;

public class FigureVerifier {
	private Set<String> dict;
	private Scanner s;
	public FigureVerifier(Set<String> dict, Scanner s) {
		this.dict = dict;
		this.s = s;
	}
	public TestResult verify(Figure figure) {
		Set<String> possiblewrong = new HashSet<String>();
		Set<String> possiblecorrect = new HashSet<String>();
		Set<String> impossiblewrong = new HashSet<String>();
		Set<String> actualwrong = new HashSet<String>();
		Set<String> actualcorrect = new HashSet<String>();
		Set<String> answers = new HashSet<String>();
		Set<String> possible = new HashSet<String>(figure.combinations);
		for(String permutations: possible)
			if(permutations!=null)
				if(dict.contains(permutations)) possiblecorrect.add(permutations);
				else possiblewrong.add(permutations);
		for(String input = "NOTBLANK";input!="";input=s.nextLine()) {
			if(answers.contains(input))continue;
			answers.add(input);
			if(!possible.contains(input)) {
				impossiblewrong.add(input);
				continue;
			}
			if(possiblecorrect.contains(input)) actualcorrect.add(input);
			else actualwrong.add(input);
		}
		TestResult result = new TestResult(
			possiblewrong,
			possiblecorrect,
			impossiblewrong,
			actualwrong,
			actualcorrect
		);
		return result;
	}
}
