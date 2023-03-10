package veicoli;

public class Furgone extends VeicoloAMotore{

	protected int capacitąCarico;
	
	public Furgone(int anno, String marca, String alim, int cc, int capCar) {
		super(anno, marca, alim, cc);
		capacitąCarico = capCar;
	}
	
	public int getCapCar() {
		return capacitąCarico;
	}
	
	public void setCapCar(int capCar) {
		capacitąCarico = capCar;
	}
	
	public String toString() {
		return super.toString() + 
				"Capacitą di carico: " + capacitąCarico;
	}
	
	
}
