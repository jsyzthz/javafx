package me.jtx.javafx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class MainPresenter implements Initializable {

	@FXML
	private TextField fileName;

	public void initialize(URL location, ResourceBundle resources) {
	}

	public void showFileName(String fileName) {
		this.fileName.setText(fileName);
	}

}
