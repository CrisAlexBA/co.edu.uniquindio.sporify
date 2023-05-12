package co.edu.uniquindio.sporify.model;

public class Cancion {

	//Atributos
	private String nombre;
	private String cantante;
	private String duracion;
	private String link;
	private String genero;
	private String imagen; //¿?

	
	//Constructores
	
	public Cancion(String nombre, String cantante, String duracion, String link, String genero, String imagen) {
		super();
		this.nombre = nombre;
		this.cantante = cantante;
		this.duracion = duracion;
		this.link = link;
		this.genero = genero;
		this.imagen = imagen;
	}
	
	public Cancion() {
		super();
	}
	
	public Cancion(String nombre, String cantante) {
		super();
		this.nombre = nombre;
		this.cantante = cantante;
	}
	
	//____________________________________________________________________ 

	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCantante() {
		return cantante;
	}
	
	public void setCantante(String cantante) {
		this.cantante = cantante;
	}
	
	public String getDuracion() {
		return duracion;
	}
	
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	
	public String getLink() {
		return link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getImagen() {
		return imagen;
	}
	
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	//____________________________________________________________________ 

	
	
	
}
