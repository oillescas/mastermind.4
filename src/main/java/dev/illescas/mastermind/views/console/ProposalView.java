package dev.illescas.mastermind.views.console;

import java.util.List;

import dev.illescas.mastermind.types.Color;
import dev.illescas.mastermind.types.Error;
import santaTecla.utils.WithConsoleView;

public class ProposalView extends WithConsoleView {
	ProposedCombinationView proposedCombinationView;
	
	public ProposalView(){
		this.proposedCombinationView = new ProposedCombinationView();
	}
	
	public void showGame(int attempts, int width) {
		this.console.writeln();
		new AttemptsView().showAttempts(attempts);
		new SecretCombinationView().showSecretConvination(width);
	}
	
	public void showCombination(List<Color> colors) {
		
		this.proposedCombinationView.showCombination(colors);
	}
	
	public void showResult( int blacks, int whites) {
		new ResultView().showResult(blacks, whites);
	}

	public void showWinner() {
		this.proposedCombinationView.showWinner();
	}

	public void showLooser() {
		this.proposedCombinationView.showLooser();
	}

	public List<Color> read() {
		return this.proposedCombinationView.read();
	}

	public void showError(Error error) {
		new ErrorView(error).writeln();
	}



}
