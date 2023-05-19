package EJ2;

public class Autor {
	
	protected String nomAutor;
	protected String apellidosAutor;
	private int anoNacimiento;
	
	public Autor(String nombre, String apellidos, int anoNacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.anoNacimiento = anoNacimiento;
	}

	public Autor() {
		super();
		this.nombre = "";
		this.apellidos = "";
		this.anoNacimiento = 0;
	}

	public Autor(Autor c) {
		super();
		this.nombre = c.nombre;
		this.apellidos = c.apellidos;
		this.anoNacimiento = c.anoNacimiento;
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

	public int getAnoNacimiento() {
		return anoNacimiento;
	}

	public void setAnoNacimiento(int anoNacimiento) {
		this.anoNacimiento = anoNacimiento;
	}

	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", apellidos=" + apellidos + ", anoNacimiento=" + anoNacimiento + "]";
	}
	
	
	
	

}
