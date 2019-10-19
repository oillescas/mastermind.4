package dev.illescas.mastermind.views.console;

import dev.illescas.mastermind.types.Error;
import santaTecla.utils.Console;

class ErrorView extends dev.illescas.mastermind.views.ErrorView {

	ErrorView(Error error) {
		super(error);
	}

	public void writeln() {
		new Console().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
	}

}
