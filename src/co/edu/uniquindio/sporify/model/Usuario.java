package co.edu.uniquindio.sporify.model;

import java.util.ArrayList;

public class Usuario {

	//Atributos
	private String nombre;
	private String contrasenia;
	private ArrayList<Cancion> listaCanciones;//lista doble...
	
	
	//Constructores
	public Usuario(String nombre, String contrasenia) {
		super();
		this.nombre = nombre;
		this.contrasenia = contrasenia;
		this.listaCanciones = new ArrayList<Cancion>();
	}
	
	public Usuario() {
		super();
	}

	//____________________________________________________________________ 

	//Getters and Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public ArrayList<Cancion> getListaCanciones() {
		return listaCanciones;
	}

	public void setListaCanciones(ArrayList<Cancion> listaCanciones) {
		this.listaCanciones = listaCanciones;
	}
	
	//____________________________________________________________________ 

	
}
