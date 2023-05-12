package co.edu.uniquindio.sporify.controller;

import co.edu.uniquindio.sporify.persistencia.Persistencia;
import co.edu.uniquindio.sporify.model.Sporify;
import co.edu.uniquindio.sporify.model.Usuario;

import java.io.IOException;


public class ModelFactoryController {

	// Atributos
	Sporify sporify;
	Usuario usuario;

	// ------------------------------ Singleton ------------------------------
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder {
		// El constructor de Singleton puede ser llamado desde aqu� al ser
		// protected
		private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
	}

	// M�todo para obtener la instancia de nuestra clase
	public static ModelFactoryController getInstance() {
		return SingletonHolder.eINSTANCE;
	}

	public ModelFactoryController() {

		cargarResourceXML();
		
		
		if (sporify == null) {
			System.out.println("es null");
		}

	}

	//____________________________________________________________________ 
	
	/*
	 * Metodos Get and Set
	 */
	
	public Sporify getSporify() {
		return sporify;
	}

	public void setSporify(Sporify sporify) {
		this.sporify = sporify;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	//-------------------------------     Métodos del Usuario    -------------------------------
	
	public boolean inicioSesionUsuario(String nombre, String contrasenia) {
		try {
			this.usuario = sporify.iniciarSesionUsuario(nombre, contrasenia);
			return usuario != null;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
//-------------------------------     Métodos Guardado Datos     -------------------------------


	//____________________________________________________________________ 

		/*
		 * Metodo que permite cargar la app del archivo xml
		 */
		public void cargarResourceXML() {
			sporify = new Sporify();
			sporify = Persistencia.cargarRecursoSubastaQuindioXML();
		}
		
	//____________________________________________________________________ 

	/*
	 * Metodo que permite guardar lo que pase en la app en un archivo binario
	 */
	public void guardarResourceBinario() {
		
		Persistencia.guardarRecursoSubastaQuindioBinario(sporify);
	}

//____________________________________________________________________ 

	/*
	 * Metodo que permite guardar lo que pase en la app en un archivo xml
	 */
	public void guardarResourceXML() {

		Persistencia.guardarRecursoSubastaQuindioXML(sporify);
	}

//____________________________________________________________________ 
	/*
	 * Método utilizado para hacer pruebas de escritorio del programa
	 */
	public void inicializarDatos() {

	}
	// ______________________________________________________________


	// -----------------------------------------------------------------------------------------------------

}
