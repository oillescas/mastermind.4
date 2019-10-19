package dev.illescas.mastermind.views.console;

import java.util.ArrayList;
import java.util.List;

import dev.illescas.mastermind.types.Color;
import dev.illescas.mastermind.views.MessageView;
import santaTecla.utils.WithConsoleView;

class ProposedCombinationView extends WithConsoleView {

	
	ProposedCombinationView() {
		
	}

	public void showCombination(List<Color> colors) {
		for (Color color : colors) {
			new ColorView(color).write();
		}
	}

	public List<Color> read() {
		String characters = this.console.readString(MessageView.PROPOSED_COMBINATION.getMessage());
		List<Color> colors = new ArrayList<Color>();
		for (int i=0; i<characters.length(); i++) {
			colors.add(ColorView.getInstance(characters.charAt(i)));
		}
		return colors;
	}

	public void showWinner() {
		this.console.writeln(MessageView.WINNER.getMessage());
	}

	public void showLooser() {
		this.console.writeln(MessageView.LOOSER.getMessage());
	}


}
