package EJ01;

public class CuentaAhorro {
	
	private final static double SALDO_MINIMO = 600;

	private double interes_variable;

	public CuentaAhorro() {
		super();
		this.interes_variable = 0;
	}

	public CuentaAhorro(long numerocuenta, double saldo, Persona cliente, double interes_variable) {
		super(numerocuenta, saldo, cliente);
		this.interes_variable = interes_variable;
	}

	public double getInteres_variable() {
		return interes_variable;
	}

	public void setInteres_variable(double interes_variable) {
		this.interes_variable = interes_variable;
	}

	@Override
	public double retirar(double cantidad) {

		if (saldo - cantidad >= SALDO_MINIMO) {
			saldo = saldo - cantidad;
		}

		return 0;
	}

	@Override
	public void actualizarSaldo() {

		saldo += saldo * interes_variable / 100;
	}
	
	@Override
	public String toString() {
		return "CuentaAhorro [interes_variable=" + interes_variable + ", numerocuenta=" + numerocuenta + ", saldo="
				+ saldo + "]";
	}

}
