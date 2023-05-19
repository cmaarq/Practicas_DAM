package EJ02;

public class Direccion {

	private String calle;
	private String ciudad;
	private int codigo_postal;
	private String pais;
	
	public Direccion() {

		this.calle = "";
		this.ciudad = "";
		this.codigo_postal = 0;
		this.pais = "";
	}
	
	public Direccion(String calle, String ciudad, int codigo_postal, String pais) {

		this.calle = calle;
		this.ciudad = ciudad;
		this.codigo_postal = codigo_postal;
		this.pais = pais;
	}
	
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(int codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", ciudad=" + ciudad + ", codigo_postal=" + codigo_postal + ", pais="
				+ pais + "]";
	}

}
