package EJ05;

public class Comercial extends Empleado {

	private double comision;

	public Comercial() {
		super();
		this.comision = 0;
	}

	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public double metodoPLUSC() {
		if (edad > 30 && comision > 200) {
			return super.PLUS + salario;
		} else {
			return salario;
		}
	}

	@Override
	public String toString() {
		return "Comercial [comision=" + comision + ", nombre=" + nombre + ", edad=" + edad + ", salario=" + this.metodoPLUSC()
				+ "]";
	}

}