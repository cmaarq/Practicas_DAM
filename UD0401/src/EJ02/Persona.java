package EJ02;

public class Persona {

	protected String nombre;
	protected String apellidos;
	protected String nif;
	protected Direccion direccion;
	
	public Persona() {
		this.nombre = "";
		this.apellidos = "";
		this.nif = "";
		this.direccion = new Direccion();
	}
	
	public Persona(String nombre, String apellidos, String nif, Direccion direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.direccion = direccion;
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
	
	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + ", direccion=" + direccion
				+ "]";
	}
	
	public void identificate() {
		
		System.out.println("Soy una persona.");
		
	}
	
}
