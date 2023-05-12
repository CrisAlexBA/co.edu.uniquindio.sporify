package co.edu.uniquindio.sporify.model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Sporify {

	
	//Atributos de la clase
	private ArrayList<Usuario> listaUsuarios;

	
	//Constructores
	public Sporify(ArrayList<Usuario> listaUsuarios) {
		super();
		this.listaUsuarios = listaUsuarios;
	}
	
	public Sporify() {
		
	}
	
	//____________________________________________________________________ 

	//Getters and Setters
	public ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	
	//____________________________________________________________________ 

	//-------------------------------     Métodos del Usuario    -------------------------------
	
	//Instancia los datos de los usuarios
	public void instanciarUsuarios() {
		listaUsuarios = new ArrayList<>();
		Usuario usuario1 = new Usuario("Alex", "123");
		Usuario usuario2 = new Usuario("Jhojan", "456");
		Usuario usuario3 = new Usuario("Juan", "789");
		
		listaUsuarios.add(usuario1);
		listaUsuarios.add(usuario2);
		listaUsuarios.add(usuario3);
	}

	//Metodo publico que retorna y verifica que el usuario a buscar exista
	public Usuario iniciarSesionUsuario(String usuario, String contrasenia) throws Exception{
		Usuario usuarioIS = validarUsuario(usuario, contrasenia);
		if (usuarioIS != null) {
			return usuarioIS;
		} else {
			throw new Exception("usuario no existe");
		}

	}
	//Metodo interno que recorre la lista de usuarios para encontrar el buscado
	private Usuario validarUsuario(String usuario, String contrasenia)
			throws FileNotFoundException, IOException {
		ArrayList<Usuario> usuarios = listaUsuarios;

		for (int indiceUsuario = 0; indiceUsuario < usuarios.size(); indiceUsuario++) {
			Usuario usuarioAux = usuarios.get(indiceUsuario);
			if (usuarioAux.getNombre().equalsIgnoreCase(usuario)
					&& usuarioAux.getContrasenia().equalsIgnoreCase(contrasenia)) {
				return usuarioAux;
			}
		}
		return null;
	}
	
	
}//FIN
