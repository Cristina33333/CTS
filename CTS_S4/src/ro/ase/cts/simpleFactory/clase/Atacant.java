package ro.ase.cts.simpleFactory.clase;

public class Atacant extends Jucator {

	public Atacant(String nume, int varsta) {
		super(nume, varsta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atacant [getNume()=");
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
