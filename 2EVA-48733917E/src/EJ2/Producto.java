package EJ2;

public class Producto {
	
	protected String nombre;
	protected int precio;
	protected int cantidad;
	
	public Producto() {
		super();
		this.nombre = "";
		this.precio = 0;
		this.cantidad = 0;
	}

	public Producto(String nombre, int precio, int cantidad) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public Producto(Producto c) {
		super();
		this.nombre = c.nombre;
		this.precio = c.precio;
		this.cantidad = c.cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	public double calcularPrecio (double iva) {
		double precioTotal = (precio + precio*iva);
		return iva;
		
	}
	
	

}
