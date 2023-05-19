package EJ01;

public class Cuenta {

	protected long numerocuenta;
	protected double saldo;
	protected Persona cliente;
	
	public Cuenta() {
		this.numerocuenta = 0;
		this.saldo = 0;
		this.cliente = new Persona();
	}
	
	public Cuenta(long numerocuenta, double saldo, Persona cliente) {
		this.numerocuenta = numerocuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	
	public long getNumerocuenta() {
		return numerocuenta;
	}

	public void setNumerocuenta(long numerocuenta) {
		this.numerocuenta = numerocuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Persona getCliente() {
		return cliente;
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}
	
	public double ingreso(double cantidad) {

		if (cantidad > 0) {
			saldo += cantidad;
		}

		return saldo;
	}
	
	public abstract double retirar(double cantidad);
	
	public abstract void actualizarSaldo();
}
