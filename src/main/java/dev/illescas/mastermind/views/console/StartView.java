package dev.illescas.mastermind.views.console;

import dev.illescas.mastermind.views.MessageView;
import santaTecla.utils.WithConsoleView;

public class StartView extends WithConsoleView {

	private SecretCombinationView secretCombinationView;
	
	public StartView(){
		this.secretCombinationView = new SecretCombinationView();
	}

	
	public void showTitle() {
		this.console.writeln(MessageView.TITLE.getMessage());
	}

	public void showSecretConvination(int width) {
		this.secretCombinationView.showSecretConvination(width);
		
	}

}
