package co.edu.uniquindio.sporify.controller;


import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class UsuarioLogController {
	
	//Instanciación del singleton
	ModelFactoryController singleton = ModelFactoryController.getInstance();
	
	

	//Inicio del javaFx
    @FXML
    private Button btnIngresar;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUsser;

    /*
     * Metodo que verifica los datos de ingreso del usurio.
     */
    @FXML
    void ingresarUsuario(ActionEvent event) {
    	//Toma los datos de los recuadros de texto
		String nombre = this.txtUsser.getText();
		String idUsuario = this.txtPassword.getText();
		//Verifica los datos de inicio
		if (singleton.inicioSesionUsuario(nombre, idUsuario) == true) {

			//Logica para desplegar la ventana de menu de canciones
			try {
				
				FXMLLoader loader = new FXMLLoader(
						getClass().getResource("/co/edu/uniquindio/sporify/view/MenuCanciones.fxml"));
				Parent root = loader.load();

				MenuCancionesController controlador = loader.getController();
				//Llamado a la instanciacion de la ventana
				controlador.init();
				Scene scene = new Scene(root);
				Stage stage = new Stage();
				stage.setTitle("Menú Anunciante");
				stage.setScene(scene);
				stage.show();
			} catch (IOException ex) {

				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setHeaderText(null);
				alert.setTitle("Error");
				alert.setContentText(ex.getMessage());
				alert.showAndWait();
			}
		} else {			
			//Mensaje por si el usuario no existe
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("Notificacion");
			alert.setContentText("Los datos no coinciden, vuelva a intentarlo.");
			alert.showAndWait();

		}
	}
    
    /*
	 * Metodo que se usa a la hora de llamar la llamar la ventana para instanciar algunos datos
	 * necesarios para la siguiente pestaña
	 */
	
    public void init() {
    	//Carga los datos de la persistencia en XML
    	singleton.cargarResourceXML();

		
	}

}


