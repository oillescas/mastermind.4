package dev.illescas.mastermind.views.console;

import dev.illescas.mastermind.views.MessageView;
import santaTecla.utils.WithConsoleView;

class AttemptsView extends WithConsoleView {

	public AttemptsView() {
	}

	void showAttempts(int attempts) {
		this.console.writeln(MessageView.ATTEMPTS.getMessage().replaceFirst("#attempts",
				"" + attempts));
	}

}
