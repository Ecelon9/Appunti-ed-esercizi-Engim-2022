
public class Veicolo {

	protected int velocitÓ;
	protected int accelerazione;
	
	public Veicolo() {
		this.velocitÓ = 0;
		this.accelerazione = 0;
	}
	
	
	public double getVelocitÓ() {
		return velocitÓ;
		
	}
	
	public void setVelocitÓ(int velocitÓ) {
		this.velocitÓ = velocitÓ;
	}
	
	public double getAccelerazione() {
		return accelerazione;
	}
	
	public void setAccelerazione(int accelerazione) {
		this.accelerazione = accelerazione;
	}
	
	public void mostraParam() {
		System.out.println("l'auto sta andando a " + velocitÓ + " km/h, accelerando a " + accelerazione + " m/s.");
	}
	
}
