package ro.ase.cts.FactoryMethod.clase;

public class Portar {
	private String nume;
	private int nrTricou;
	
	public Portar(String nume, int nrTricou) {
		super();
		this.nume = nume;
		this.nrTricou = nrTricou;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Portar [nume=");
		builder.append(nume);
		builder.append(", nrTricou=");
		builder.append(nrTricou);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
