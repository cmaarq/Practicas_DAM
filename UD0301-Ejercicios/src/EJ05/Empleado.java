package EJ05;

public class Empleado {
	
	protected String nombre;
	protected int edad;
	protected double salario;
	protected static final double PLUS = 300;
	
	public Empleado() {
		super();
		this.nombre = "";
		this.edad = 0;
		this.salario = 0;
	}

	public Empleado(String nombre, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	public Empleado(Empleado copia) {
		super();
		this.nombre = copia.nombre;
		this.edad = copia.edad;
		this.salario = copia.salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public static double getPlus() {
		return PLUS;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + "]";
	}
	
	
	

}
