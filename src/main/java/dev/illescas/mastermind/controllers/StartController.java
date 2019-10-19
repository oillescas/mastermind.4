package dev.illescas.mastermind.controllers;

import dev.illescas.mastermind.models.Session;
import dev.illescas.mastermind.views.console.StartView;

public class StartController extends Controller {

	private StartView starView;

	public StartController(Session session) {
		super(session);
		this.starView = new StartView();
	}

	public void start() {
		this.session.next();
	}

	@Override
	public void control() {
		this.start();
		this.starView.showTitle();
		this.starView.showSecretConvination(this.session.getWidth());
	}

}
