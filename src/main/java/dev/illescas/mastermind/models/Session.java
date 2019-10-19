package dev.illescas.mastermind.models;

import java.util.List;

import dev.illescas.mastermind.types.Color;

public class Session {
	public Game game;
	public State state;

	public Session(Game game, State state) {
		this.game = game;
		this.state = state;
	}

	public StateValue getValueState() {
		return this.state.getValueState();
	}

	public void next() {
		this.state.next();
	}

	public int getWidth() {
		return this.game.getWidth();
	}

	public void addProposedCombination(List<Color> colors) {
		this.game.addProposedCombination(colors);
	}

	public boolean isWinner() {
		return this.game.isWinner();
	}

	public boolean isLooser() {
		return this.game.isLooser();
	}

	public int getAttempts() {
		return this.game.getAttempts();
	}

	public List<Color> getColors(int position) {
		return this.game.getColors(position);
	}

	public int getBlacks(int position) {
		return this.game.getBlacks(position);
	}

	public int getWhites(int position) {
		return this.game.getWhites(position);
	}

	public void reset() {
		this.game.clear();
		this.state.reset();
	}
}