package ro.ase.cts.facade.clase;

public class Picolo {
	
	private String nume;

	public Picolo(String nume) {
		super();
		this.nume = nume;
	}
	
	public 	boolean esteDebarasta(Masa masa) {
		return masa.getCod() %2 ==0;
	}
	
	public boolean esteAranjata(Masa masa) {
		return masa.getCod() % 5 ==0;
 	}
	
	
}
