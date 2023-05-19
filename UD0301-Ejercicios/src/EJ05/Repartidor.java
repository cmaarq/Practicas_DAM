package EJ05;

public class Repartidor extends Empleado {

	private String zona;

	public Repartidor() {
		super();
		this.zona = "";

	}

	public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public double metodoPLUSR() {

		if (edad < 25 && zona.equals("3")) {
			return PLUS + salario;
		} else {
			return salario;
		}

	}

	@Override
	public String toString() {
		return "Repartidor [zona=" + zona + ", nombre=" + nombre + ", edad=" + edad + ", salario=" + this.metodoPLUSR() + "]";
	}
	
}

