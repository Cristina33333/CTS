package ro.ase.cts.simpleFactory.clase;

public class Portar extends Jucator {

	public Portar(String nume, int varsta) {
		super(nume, varsta);
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Portar [getNume()=");
		builder.append(getNume());
		builder.append(", getVarsta()=");
		builder.append(getVarsta());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}


	
	

}
