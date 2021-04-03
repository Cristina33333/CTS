package ro.ase.cts.builder.clase;

public class Rezervare {
	private int cod;
	private boolean areMancareInclusa;
	private boolean areScaunErgonomic;
	private boolean areBauturaRacoritoare;
	private boolean areMuzicaAmbientala;
	private String genMuzical;
	
	
	public Rezervare(int cod, boolean areMancareInclusa, boolean areScaunErgonomic, boolean areBauturaRacoritoare,
			boolean areMuzicaAmbientala, String genMuzical) {
		super();
		this.cod = cod;
		this.areMancareInclusa = areMancareInclusa;
		this.areScaunErgonomic = areScaunErgonomic;
		this.areBauturaRacoritoare = areBauturaRacoritoare;
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		this.genMuzical = genMuzical;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}


	public void setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
	}


	public void setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
	}


	public void setAreBauturaRacoritoare(boolean areBauturaRacoritoare) {
		this.areBauturaRacoritoare = areBauturaRacoritoare;
	}


	public void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
	}


	public void setGenMuzical(String genMuzical) {
		this.genMuzical = genMuzical;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [cod=");
		builder.append(cod);
		builder.append(", areMancareInclusa=");
		builder.append(areMancareInclusa);
		builder.append(", areScaunErgonomic=");
		builder.append(areScaunErgonomic);
		builder.append(", areBauturaRacoritoare=");
		builder.append(areBauturaRacoritoare);
		builder.append(", areMuzicaAmbientala=");
		builder.append(areMuzicaAmbientala);
		builder.append(", genMuzical=");
		builder.append(genMuzical);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
