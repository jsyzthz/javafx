package me.jtx.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestApp extends Application {

	private static String[] parameters;

	public static void main(String[] args) {
		parameters = args;
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		// Map<Object, Object> context = new HashMap<>();
		//
		// Injector.setConfigurationSource(context::get);
		MainView mainView = new MainView();
		if (parameters.length > 0) {
			mainView.showFileName(parameters[0]);
		}
		Scene scene = new Scene(mainView.getView(), 1024, 680);

		primaryStage.setTitle("Test JAVAFX");
		primaryStage.setScene(scene);
		primaryStage.centerOnScreen();
		primaryStage.show();
	}

}
