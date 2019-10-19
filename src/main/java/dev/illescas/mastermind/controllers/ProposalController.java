package dev.illescas.mastermind.controllers;

import java.util.List;

import dev.illescas.mastermind.models.Combination;
import dev.illescas.mastermind.models.Session;
import dev.illescas.mastermind.types.Color;
import dev.illescas.mastermind.types.Error;
import dev.illescas.mastermind.views.console.ProposalView;

public class ProposalController extends Controller {
	
	private ProposalView proposalView;

	public ProposalController(Session session) {
		super(session);
		this.proposalView = new ProposalView();
	}

	private Error addProposedCombination(List<Color> colors) {
		Error error = null;
		if (colors.size() != Combination.getWidth()) {
			error = Error.WRONG_LENGTH;
		} else {
			for (int i = 0; i < colors.size(); i++) {
				if (colors.get(i) == null) {
					error = Error.WRONG_CHARACTERS;
				} else {
					for (int j = i+1; j < colors.size(); j++) {
						if (colors.get(i) == colors.get(j)) {
							error = Error.DUPLICATED;
						}
					}
				}
			}
		}
		if (error == null){
			this.session.addProposedCombination(colors);
			if (this.session.isWinner() || this.session.isLooser()) {
				this.session.next();
			}
		}
		return error;
	}

	private boolean isWinner() {
		return this.session.isWinner();
	}

	private boolean isLooser() {
		return this.session.isLooser();
	}

	private int getAttempts() {
		return this.session.getAttempts();
	}

	private List<Color> getColors(int position) {
		return this.session.getColors(position);
	}

	private int getBlacks(int position) {
		return this.session.getBlacks(position);
	}

	private int getWhites(int position) {
		return this.session.getWhites(position);
	}

	@Override
	public void control() {
		Error error;
		do {
			List<Color> colors = this.proposalView.read();
			error = this.addProposedCombination(colors);
			if (error != null) {
				this.proposalView.showError(error);
			}
		} while (error != null);
		
		this.proposalView.showGame(this.getAttempts(), this.getWidth() );
		for (int i = 0; i < this.getAttempts(); i++) {
			proposalView.showCombination(this.getColors(i));
			proposalView.showResult(this.getBlacks(i), this.getWhites(i));
		}
		
		if (this.isWinner()) {
			this.proposalView.showWinner();
		} else if (this.isLooser()) {
			this.proposalView.showLooser();
		}
	}

}
