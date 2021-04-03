package ro.ase.cts.builder.main;

import ro.ase.cts.builder.clase.BuilderRezervare;
import ro.ase.cts.builder.clase.BuilderRezervareV2;
import ro.ase.cts.builder.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare = new Rezervare(12, false, false, false, true, "pop");
		
		
		BuilderRezervare builderRezervare = new BuilderRezervare().setCod(1).setAreBauturaRacoritoare(false).setAreMancareInclusa(false).setAreScaunErgonomic(false).setAreMuzicaAmbientala(true).setGenMuzical("rock");
		Rezervare rezervare1 = builderRezervare.build();
		Rezervare rezervare2 = new BuilderRezervare().setCod(2).setAreScaunErgonomic(true).build();
		Rezervare rezervare3 = new BuilderRezervare(100).setAreMancareInclusa(true).build();
		System.out.println(rezervare1.toString());
		System.out.println(rezervare2.toString());
		System.out.println(rezervare3.toString());
		
		
		
		BuilderRezervareV2 builderV2 = new BuilderRezervareV2().setAreMancareInclusa(true).setAreBauturaRacoritoare(true).setAreScaunErgonomic(true);
		Rezervare rezervare20 = builderV2.setCod(100).build();
		Rezervare rezervare21 = builderV2.setCod(101).build();
		System.out.println(rezervare20.toString());
		System.out.println(rezervare21.toString());

	}

}
