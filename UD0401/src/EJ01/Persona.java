package EJ01;

public class Persona {

	private String nombre;
	private String apellidos;
	private String nif;
	
	public Persona() {
		this.nombre = "";
		this.apellidos = "";
		this.nif = "";

	}
	
	public Persona(String nombre, String apellidos, String nif) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNIF() {
		return nif;
	}

	public void setNIF(String nif) {
		this.nif = nif;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + nif + "]";
	}

	
}
