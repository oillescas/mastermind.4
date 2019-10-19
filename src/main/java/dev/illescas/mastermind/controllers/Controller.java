package dev.illescas.mastermind.controllers;

import dev.illescas.mastermind.models.Session;

public abstract class Controller {

	protected Session session;

	Controller(Session session) {
		this.session = session;
	}

	public int getWidth() {
		return this.session.getWidth();
	}

    public abstract void control();

}
