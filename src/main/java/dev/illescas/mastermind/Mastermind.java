package dev.illescas.mastermind;

import java.util.HashMap;

import dev.illescas.mastermind.controllers.Controller;
import dev.illescas.mastermind.controllers.ProposalController;
import dev.illescas.mastermind.controllers.ResumeController;
import dev.illescas.mastermind.controllers.StartController;
import dev.illescas.mastermind.models.Game;
import dev.illescas.mastermind.models.Session;
import dev.illescas.mastermind.models.State;
import dev.illescas.mastermind.models.StateValue;

public class Mastermind {
	
	private HashMap<StateValue, Controller> controllers;
	private Session session;

	protected Mastermind() {
	this.session = new Session(new Game(), new State());
	this.controllers = new HashMap<StateValue, Controller>();
	this.controllers.put(StateValue.INITIAL, new StartController(this.session));
	this.controllers.put(StateValue.IN_GAME, new ProposalController(this.session));
	this.controllers.put(StateValue.FINAL, new ResumeController(this.session));
	this.controllers.put(StateValue.EXIT, null);
}

	public Controller getController() {
		return this.controllers.get(this.session.getValueState());
	}

	protected void play() {
		Controller controller;
		do {
			controller = this.getController();
			if (controller != null){
				controller.control();
			}
		} while (controller != null);
	}
	
	public static void main(String[] args) {
		new Mastermind().play();
	}

}

