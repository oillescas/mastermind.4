package dev.illescas.mastermind.views.console;

import dev.illescas.mastermind.views.MessageView;
import santaTecla.utils.WithConsoleView;

class ResultView extends WithConsoleView {

	ResultView(){}

	void showResult(int blacks, int whites) {
		this.console.writeln(MessageView.RESULT.getMessage()
				.replaceFirst("#blacks", "" + blacks)
				.replaceFirst("#whites", "" + whites));
	}

}
