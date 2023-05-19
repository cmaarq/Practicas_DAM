package EJ04;

public class Lavadora extends Electrodomestico {

	protected final static int CARGA_DEF = 5;

	private int carga;


	public Lavadora() {
		super();
		this.carga = CARGA_DEF;
	}

	public Lavadora(double precio, double peso) {
		super(precio, peso);
		this.carga = CARGA_DEF;

	}

	public Lavadora(double precio, String color, char consumoEnergetico, double peso, int carga) {
		super(precio, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;

	}

	public double precioFinal() {

		if (carga > 30) {
			return super.precioFinal() + 50;
		} else {
			return super.precioFinal();
		}
	}

}
