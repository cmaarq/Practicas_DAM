package EJ01;

public class Contador {
	
	private int cont;

	public Contador() {
		super();
		this.cont = 0;
	}

	public Contador(int cont) {
		super();
		this.cont = comprobarNegativo (cont);
	}
	
	public Contador (Contador c) {
		super ();
		this.cont = c.cont;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	private int comprobarNegativo (int num) {
		if (num < 0) {
			return 0;
		}else {
			return num;
		}
		
	}
	
	public void incrementar () {
		this.cont++;
	}
	
	public void decrementar () {
		this.cont.comprobarNegativo (this.cont--);
	}
	
	
	
	

}
