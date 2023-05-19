package EJ02;

public class Estudiante {

	private int id;
	
	public Estudiante() {
		super();
		this.id = 0;
	}
	
	public Estudiante(String nombre, String apellidos, String nif, Direccion direccion, int id) {
		super (nombre, apellidos, nif, direccion);
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif
				+ ", direccion=" + this.direccion.toString() + "]";
	}

}
