package EJ04;

public class Television extends Electrodomestico {

		protected static final int RESOLUCION = 20;
		protected static final boolean TDT = false;

		private int resolucion;
		private boolean tdt;

		public Television() {
			super();
			this.resolucion = RESOLUCION;
			this.tdt = TDT;

		}

		public Television(double precio, double peso) {
			super(precio, peso);
			this.resolucion = RESOLUCION;
			this.tdt = TDT;
		}

		public Television(double precio, String color, char consumoEnergetico, double peso, int resolucion,
				boolean tdt) {
			super(precio, color, consumoEnergetico, peso);
			this.resolucion = resolucion;
			this.tdt = tdt;
		}

		public int getResolucion() {
			return resolucion;
		}

		public void setResolucion(int resolucion) {
			this.resolucion = resolucion;
		}

		public boolean isTdt() {
			return tdt;
		}

		public void setTdt(boolean tdt) {
			this.tdt = tdt;
		}

		private double precioresolucion() {

			if (resolucion > 40) {

				return super.precioFinal() * 0.30;

			} else {
				return 0;
			}

		}

		private int TDT() {

			if (tdt) {

				return 50;

			} else {
				return 0;
			}
		}

		public double precioFinal() {

			return super.precioFinal() + precioresolucion() + TDT();

		}

}
	
