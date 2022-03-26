package taller3.televisores;

public class Control {
	private TV tv;
	
	public Control() {
		
	}
	
	public void enlazar(TV tv) {
		this.tv = tv;
		this.tv.setControl(this);
	}
	
	// ----- ACCESO REMOTO -----
	public void turnOn() {
		this.tv.turnOn();
	}
	
	public void turnOff() {
		this.tv.turnOff();
	}
	
	public void canalUp() {
		this.tv.canalUp();
	}
	
	public void canalDown() {
		this.tv.canalDown();
	}
	
	public void volumenUp() {
		this.tv.volumenUp();
	}
	
	public void volumenDown() {
		this.tv.volumenDown();
	}
	
	public void setCanal(int canal) {
		if(this.tv.getEstado() && canal >= 1 && canal <= 120) {
			this.tv.setCanal(canal);
		}
	}
	
	// ----- GET Y SET -----
	public TV getTv() {
		return this.tv;
	}
	
	public void setTv(TV tv) {
		this.tv = tv;
	}

}
