package EJ2;

public class Juguete extends Producto{
	
	private String marca;
	private String tipo;
	private static double iva = 0.15;
	
	public Juguete(String nombre, int precio, int cantidad, String marca, String tipo, double iva) {
		super(nombre, precio, cantidad);
		this.marca = marca;
		this.tipo = tipo;
		this.iva = iva;
	}

	public Juguete(String marca, String tipo, double iva) {
		super();
		this.marca = "";
		this.tipo = "";
		this.iva = 0.15;
	}

	public Juguete(Juguete c) {
		super();
		this.marca = c.marca;
		this.tipo = c.tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public static double getIva() {
		return iva;
	}

	public static void setIva(double iva) {
		Juguete.iva = iva;
	}

	@Override
	public String toString() {
		return "Juguete [marca=" + marca + ", tipo=" + tipo + "]";
	}
	
	

}
