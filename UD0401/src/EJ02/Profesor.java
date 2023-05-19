package EJ02;

public class Profesor {

	private String despacho;
	
	public Profesor() {
		super();
		this.despacho = "";
	}
	
	public Profesor(String nombre, String apellidos, String nif, Direccion direccion, String despacho) {
		super(nombre, apellidos, nif, direccion);
		this.despacho = despacho;
	}
	
	@Override
	public String toString() {
		return "Profesor [despacho=" + despacho + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif
				+ ", direccion=" + this.direccion.toString() + "]";
	}

}
