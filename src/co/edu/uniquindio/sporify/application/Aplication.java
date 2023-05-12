package co.edu.uniquindio.sporify.application;

import java.io.IOException;

import co.edu.uniquindio.sporify.controller.ModelFactoryController;
import co.edu.uniquindio.sporify.controller.UsuarioLogController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Aplication extends Application {

	// Inicialización del singleton
	static ModelFactoryController singleton = ModelFactoryController.getInstance();

	@Override
	public void start(Stage primaryStage) {

		try {
			FXMLLoader ventana = new FXMLLoader();
			ventana.setLocation(Aplication.class.getResource("/co/edu/uniquindio/sporify/view/UsuarioLog.fxml"));
			
			AnchorPane diseño = (AnchorPane)ventana.load();
			UsuarioLogController loginController = ventana.getController();
			loginController.init();
			Scene lugar = new Scene(diseño);
			Stage Escena = new Stage();
			Escena.setScene(lugar);
			Escena.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		
		launch(args);

	}
}