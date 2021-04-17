package ro.ase.cts.composite.main;

import ro.ase.cts.composite.clase.Item;
import ro.ase.cts.composite.clase.Sectiune;

public class Main {

	public static void main(String[] args) {
		Sectiune bauturi = new Sectiune("bauturi");
		Sectiune mancare = new Sectiune("mancare");
		
		Item cola = new Item("Cola");
		Item fanta = new Item("fanta");
		
		Item ciorba = new Item("ciorba");
		Item mazare = new Item("mazare");
		
		bauturi.adugaComponenta(fanta);
		bauturi.adugaComponenta(cola);
		mancare.adugaComponenta(ciorba);
		mancare.adugaComponenta(mazare);
		
		Sectiune meniu = new Sectiune("Meniu");
		meniu.adugaComponenta(bauturi);
		meniu.adugaComponenta(mancare);
		
		meniu.afisareDescriere();
	}

}
