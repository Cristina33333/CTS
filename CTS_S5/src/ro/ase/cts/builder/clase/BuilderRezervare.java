package ro.ase.cts.builder.clase;

public class BuilderRezervare implements AbstractBuilder {

	Rezervare rezervare = null;
	
	
	
	public BuilderRezervare() {
		this.rezervare = new Rezervare(0, false, false,false, false, null);
		
	}
	
	public BuilderRezervare(int cod) {
		this.rezervare = new Rezervare(cod, false, false,false, false, null);
		
	}
	

	public BuilderRezervare  setAreMancareInclusa(boolean areMancareInclusa) {
		 this.rezervare.setAreMancareInclusa(areMancareInclusa);
		 return this;
	}
	
	public BuilderRezervare  setCod(int cod) {
		 this.rezervare.setCod(cod);
		 return this;
	}
	
	public BuilderRezervare setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
		return this;
	}


	public BuilderRezervare setAreBauturaRacoritoare(boolean areBauturaRacoritoare) {
		this.rezervare.setAreBauturaRacoritoare(areBauturaRacoritoare);
		return this;
	}


	public BuilderRezervare setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
		return this;
	}
	
	public BuilderRezervare setGenMuzical(String genMuzical) {
		this.rezervare.setGenMuzical(genMuzical);
		return this;
	}

	@Override
	public Rezervare build() {
		
		return rezervare;
	}
	
}
