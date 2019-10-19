package dev.illescas.mastermind.views.console;

import dev.illescas.mastermind.views.MessageView;
import santaTecla.utils.WithConsoleView;

class SecretCombinationView extends WithConsoleView {
	
	public SecretCombinationView() {
		super();
	}

	public void showSecretConvination(int convinationWidth) {
		for (int i = 0; i < convinationWidth; i++) {
			this.console.write(MessageView.SECRET.getMessage());
		}
		this.console.writeln();
	}

}
