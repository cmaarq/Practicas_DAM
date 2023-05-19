package EJ2;

public class Libro extends Producto {
	
	private String autor;
	private String editorial;
	private static double iva = 0.02;
	
	public Libro(String nombre, int precio, int cantidad, String autor, String editorial) {
		super(nombre, precio, cantidad);
		this.autor = autor;
		this.editorial = editorial;
		this.iva = iva;
	}

	public Libro() {
		super();
		this.autor = "";
		this.editorial = "";
		this.iva = 0.02;
	}

	public Libro(Libro c) {
		super();
		this.autor = c.autor;
		this.editorial = c.editorial;
		this.iva = c.iva;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public static double getIva() {
		return iva;
	}

	public static void setIva(double iva) {
		Libro.iva = iva;
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", editorial=" + editorial + "]";
	}
	
	
	

}
