package ro.ase.cts.singleton.elefant;

public class Elefant {
	private int varsta;
	private float greutate;
	private String nume;
	private String origine;
	
	private static Elefant elefant = null;
	
	private Elefant(int varsta, float greutate, String nume, String origine) {
		super();
		this.varsta = varsta;
		this.greutate = greutate;
		this.nume = nume;
		this.origine = origine;
	}
	
	public static synchronized Elefant getInstance(int varsta, float greutate, String nume, String origine) {
		if (elefant == null) {
				elefant = new Elefant(varsta, greutate, nume, origine);
		}
		return elefant;
	}


	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}


	public void setGreutate(float greutate) {
		this.greutate = greutate;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}


	public void setOrigine(String origine) {
		this.origine = origine;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Elefant [varsta=");
		builder.append(varsta);
		builder.append(", greutate=");
		builder.append(greutate);
		builder.append(", nume=");
		builder.append(nume);
		builder.append(", origine=");
		builder.append(origine);
		builder.append("]");
		return builder.toString();
	}
	
	

}
