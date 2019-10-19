package dev.illescas.mastermind.controllers;

import dev.illescas.mastermind.models.Session;
import dev.illescas.mastermind.views.console.ResumeView;

public class ResumeController extends Controller {

	public ResumeController(Session session) {
		super(session);
	}

	public void resume(boolean newGame) {
		if (newGame) {
			this.session.reset();
		} else {
			this.session.next();
		}
	}

	@Override
	public void control() {
		this.resume(new ResumeView().readYesNo());
		
	}

	

}
