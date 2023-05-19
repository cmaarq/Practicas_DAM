package EJ2;

public class Editorial {
	
	protected String nomEditorial;
	private String cif;
	private String direccion;
	
	public Editorial(String nomEditorial, String cif, String direccion) {
		super();
		this.nomEditorial = nomEditorial;
		this.cif = cif;
		this.direccion = direccion;
	}

	public Editorial() {
		super();
		this.nomEditorial = "";
		this.cif = "";
		this.direccion = "";
	}

	public Editorial(Editorial c) {
		super();
		this.nomEditorial = c.nomEditorial;
		this.cif = c.cif;
		this.direccion = c.direccion;
	}

	public String getNomEditorial() {
		return nomEditorial;
	}

	public void setNomEditorial(String nomEditorial) {
		this.nomEditorial = nomEditorial;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Editorial [nomEditorial=" + nomEditorial + ", cif=" + cif + ", direccion=" + direccion + "]";
	}
	
	

}
