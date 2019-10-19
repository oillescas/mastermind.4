package dev.illescas.mastermind.views.console;

import dev.illescas.mastermind.views.MessageView;
import santaTecla.utils.YesNoDialog;

public class ResumeView {

	public boolean readYesNo() {
		return new YesNoDialog().read(MessageView.RESUME.getMessage());
	}

}
