package EJ01;

public class CuentaCorriente {
	
	private static final double INTERES = 1.5;

	public CuentaCorriente() {
		super();
	}

	public CuentaCorriente(long numerocuenta, double saldo, Persona cliente) {
		super(numerocuenta, saldo, cliente);
	}

	@Override
	public String toString() {
		return "CuentaCorriente [numerocuenta=" + numerocuenta + ", saldo=" + saldo + "]";
	}

	@Override
	public double retirar(double cantidad) {

		if (saldo >= cantidad && saldo > 0) {
			saldo = saldo - cantidad;
		}

		return 0;
	}

	@Override
	public void actualizarSaldo() {

		saldo += saldo * INTERES / 100;
	}

}
