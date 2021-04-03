package ro.ase.cts.FactoryMethod.clase;

public class Atacant {
	private String nume;
	private int nrTricou;
	
	public Atacant(String nume, int nrTricou) {
		super();
		this.nume = nume;
		this.nrTricou = nrTricou;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atacant [nume=");
		builder.append(nume);
		builder.append(", nrTricou=");
		builder.append(nrTricou);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
