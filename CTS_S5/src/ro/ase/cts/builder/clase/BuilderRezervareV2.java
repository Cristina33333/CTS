package ro.ase.cts.builder.clase;

public class BuilderRezervareV2 implements AbstractBuilder{
	private int cod;
	private boolean areMancareInclusa;
	private boolean areScaunErgonomic;
	private boolean areBauturaRacoritoare;
	private boolean areMuzicaAmbientala;
	private String genMuzical;

	@Override
	public Rezervare build() {
		
		return new Rezervare(cod, areMancareInclusa, areScaunErgonomic, areBauturaRacoritoare, areMuzicaAmbientala, genMuzical);
	}

	public BuilderRezervareV2() {
		cod=1000;
		genMuzical="Rock";
		
	}

	public BuilderRezervareV2 setCod(int cod) {
		this.cod = cod;
		return this;
	}

	public BuilderRezervareV2 setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
		return this;
	}

	public BuilderRezervareV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
		return this;
	}

	public BuilderRezervareV2 setAreBauturaRacoritoare(boolean areBauturaRacoritoare) {
		this.areBauturaRacoritoare = areBauturaRacoritoare;
		return this;
	}

	public BuilderRezervareV2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		return this;
	}

	public BuilderRezervareV2 setGenMuzical(String genMuzical) {
		this.genMuzical = genMuzical;
		return this;
	}
	
	

}
