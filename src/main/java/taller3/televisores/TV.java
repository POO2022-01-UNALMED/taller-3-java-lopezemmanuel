package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	
	private static int numTV = 0;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		TV.numTV += 1;
	}
	
	
	// ----- GET -----
	public Marca getMarca() {
		return this.marca;
	}
	
	public Control getControl() {
		return this.control;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public int getVolumen() {
		return this.volumen;
	}
	
	public int getCanal() {
		return this.canal;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public static int getNumTV() {
		return TV.numTV;
	}
	
	// ----- SET -----
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setVolumen(int volumen) {
		if(this.estado && volumen >= 0 && volumen <= 7) {
			this.volumen = volumen;
		}
	}
	
	public void setCanal(int canal) {
		if(this.estado && canal >= 1 && canal <= 120) {
			this.canal = canal;
		}
	}
	
	static public void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
	// ----- OTROS -----
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public void canalUp() {
		if(this.estado && this.canal < 120) {
			this.canal += 1;
		}
	}
	
	public void canalDown() {
		if(this.estado && this.canal > 1) {
			this.canal -= 1;
		}
	}
	
	public void volumenUp() {
		if(this.estado && this.volumen < 7) {
			this.volumen += 1;
		}
	}
	
	public void volumenDown() {
		if(this.estado && this.volumen > 0) {
			this.volumen -= 1;
		}
	}
}
