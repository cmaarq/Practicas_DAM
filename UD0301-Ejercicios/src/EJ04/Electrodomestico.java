package EJ04;

public class Electrodomestico {
	
	protected static final double PRECIO_BASE = 100;
	protected static final String COLOR_DEF = "blanco";
	protected static final char CONSUMO_ENERGETICO_DEF = 'F';
	protected static final double PESO_DEF = 5;
	protected static final String[] COLORES = {"negro", "rojo", "azul", "gris"};
	
	protected double precio;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	public Electrodomestico() {
		super();
		this.precio = PRECIO_BASE;
		this.color = COLOR_DEF;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
		this.peso = PESO_DEF;
	}

	public Electrodomestico(double precio, double peso) {
		super();
		this.precio = precio;
		this.color = COLOR_DEF;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
		this.peso = peso;
	}

	public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
		super();
		this.precio = precio;
		this.color = color.toLowerCase();
		this.color = comprobarColor;
		this.consumoEnergetico = Character.toUpperCase(consumoEnergetico);
		this.peso = peso;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico
				+ ", peso=" + peso + "]";
	}

	private char comprobarConsumoEnergetico(char letra) {

		if (consumoEnergetico < 'Z' && consumoEnergetico > 'A') {
			letra = consumoEnergetico;
		}
		return CONSUMO_ENERGETICO_DEF;
		}
	
	private String comprobarColor() {

		for (String c : COLORES) {
			if (c.equals(color)) {
				return color;
			}
		}
		return COLOR_DEF;
		}
	
	public int precioConsumo() {

		switch (consumoEnergetico) {
		case 'A':
			return 100;
		case 'B':
			return 80;
		case 'C':
			return 60;
		case 'D':
			return 50;
		case 'E':
			return 30;
		case 'F':
			return 10;

		default:
			return CONSUMO_ENERGETICO_DEF;
			}
		}
	
	public int precioPeso() {

		if (peso > 0 && peso <= 19) {
			return 10;
		} else if (peso >= 20 && peso <= 49) {
			return 50;
		} else if (peso >= 50 && peso <= 79) {
			return 80;
		} else {
			return 100;
		}

	}
	
	public double precioFinal() {

		return precio + precioConsumo() + precioPeso();

	}    
	
}
