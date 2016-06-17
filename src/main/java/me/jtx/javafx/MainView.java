package me.jtx.javafx;

import com.airhacks.afterburner.views.FXMLView;

public class MainView extends FXMLView {

	void showFileName(String fileName) {
		MainPresenter presenter = (MainPresenter) getPresenter();
		presenter.showFileName(fileName);
	}
}
