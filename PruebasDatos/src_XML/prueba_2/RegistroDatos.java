package prueba_2;

import java.io.Serializable;

public class RegistroDatos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre, apellidos, telefono,id;
	
	public RegistroDatos(){
		
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getId() {
		return id;
	}
	public RegistroDatos(String id,String nom, String ape, String tel) {
		// TODO Auto-generated constructor stub
		this.id=id;
		nombre=nom;
		apellidos=ape;
		telefono=tel;
	}
	
	public String dameDatos(){
		return "ID: "+id+"\nNombre: "+ nombre +"\nApellido:"+ apellidos + "\nTelefono: "+ telefono;
	}
	
}
