package co.edu.uniquindio.sporify.persistencia;

import co.edu.uniquindio.sporify.model.Sporify;

public class Persistencia {

	/*
	 * Las rutas de los archivos
	 */
	public static final String RUTA_ARCHIVO_SPORIFY = "src/co/edu/uniquindio/sporify/persistencia/archivos/SporifyXML.xml";
	public static final String RUTA_ARCHIVO_SPORIFYBINARIO = "src/co/edu/uniquindio/sporify/persistencia/archivos/SporifyDAT.dat";
	// ---------------------------------- Métodos Usuario  -----------------------------------------
	
	
	
		// ---------------------------------- Métodos Carga Datos ----------------------------------

	/*
	 * Metodo que permite guardar todo lo que se haga en la aplicacion en un archivo
	 * xml
	 */
	public static void guardarRecursoSubastaQuindioXML(Sporify sporify) {

		try {
			ArchivoUtil.salvarRecursoSerializadoXML(RUTA_ARCHIVO_SPORIFY, sporify);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

// _______________________________________________________________________________

	/*
	 * Metodo que permite cargar la aplicacion mediante un archivo serializadoXML
	 */
	public static Sporify cargarRecursoSubastaQuindioXML() {

		Sporify sporify = null;

		try {
			sporify = (Sporify) ArchivoUtil.cargarRecursoSerializadoXML(RUTA_ARCHIVO_SPORIFY);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sporify;

	}

// _______________________________________________________________________________

	/*
	 * Metodo que permite guardar todo lo que se haga en la aplicacion en un archivo
	 * binario
	 */
	public static void guardarRecursoSubastaQuindioBinario(Sporify sporify) {

		try {
			ArchivoUtil.salvarRecursoSerializado(RUTA_ARCHIVO_SPORIFYBINARIO, sporify);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Hay un error al guardar el archivo en binario");
		}
	}
// _______________________________________________________________________________


}
