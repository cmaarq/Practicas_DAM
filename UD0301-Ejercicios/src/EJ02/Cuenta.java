package EJ02;

public class Cuenta {

	private String nombreCliente;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;

	public Cuenta() {
		this.nombreCliente = "";
		this.numeroCuenta = "";
		this.tipoInteres = 0;
		this.saldo = 0;
	}

	public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {
		super();
		this.nombreCliente = nombreCliente;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}

	public Cuenta(Cuenta copia) {
		this.nombreCliente = copia.nombreCliente;
		this.numeroCuenta = copia.numeroCuenta;
		this.tipoInteres = copia.tipoInteres;
		this.saldo = copia.saldo;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean ingreso(double cantidad) {
		if (cantidad > 0) {
			this.saldo += cantidad;
			return true;

		} else {
			return false;
		}

	}

	public boolean reintegro(double cantidad) {
		if (cantidad > 0 && this.saldo >= cantidad) {
			this.saldo -= cantidad;
			return true;

		} else {
			return false;
		}
	}

	public boolean transferencia(Cuenta cuentaDestino, double cantidad) {
		if (this.saldo >= cantidad) {
			this.saldo -= cantidad;
			cuentaDestino.ingreso(cantidad);
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public String toString() {
		return "Cuenta [nombreCliente=" + nombreCliente + ", numeroCuenta=" + numeroCuenta + ", tipoInteres="
				+ tipoInteres + ", saldo=" + saldo + "]";
	}

}
