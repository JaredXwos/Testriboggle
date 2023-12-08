package verifyFigure;

import java.util.Set;

public record TestResult(
		Set<String> possiblewrong,
		Set<String> possiblecorrect,
		Set<String> impossiblewrong,
		Set<String> actualwrong,
		Set<String> actualcorrect
) {}
