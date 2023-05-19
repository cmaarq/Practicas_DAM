package EJ03;

public class Libro {

	private String titulo;
	private String autor;
	private int ejemplares;
	private int ejemplaresPrestados;

	public Libro() {
		super();
		this.titulo = "";
		this.autor = "";
		this.ejemplares = 0;
		this.ejemplaresPrestados = 0;
	}

	public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.ejemplaresPrestados = ejemplaresPrestados;
	}

	public Libro(Libro copia) {
		super();
		this.titulo = copia.titulo;
		this.autor = copia.autor;
		this.ejemplares = copia.ejemplares;
		this.ejemplaresPrestados = copia.ejemplaresPrestados;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}

	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		this.ejemplaresPrestados = ejemplaresPrestados;
	}

	public boolean prestamo () {
		if (ejemplares > 0) {
			ejemplares--;
			ejemplaresPrestados++;
			return true;
		
		} else {
			return false;
		}

	}
	
	public boolean devolucion () {
		if (ejemplaresPrestados > 0) {
			ejemplaresPrestados--;
			ejemplares++;
			return true;
		
		}else {
			return false;	
		}
		
	}
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", ejemplaresPrestados="
				+ ejemplaresPrestados + "]";
	}
	
	
	
}
