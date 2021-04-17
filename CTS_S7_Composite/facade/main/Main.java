package ro.ase.cts.facade.main;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Masa;
import ro.ase.cts.facade.clase.OperatorMese;
import ro.ase.cts.facade.clase.Picolo;

public class Main {

	
	public static void main(String[] args) {
		/*
		 * Masa masa1 = new Masa(12, 0); if(OperatorMese.esteLibera(masa1)) { Picolo
		 * andrei = new Picolo("Andrei"); if(andrei.esteDebarasta(masa1) &&
		 * andrei.esteAranjata(masa1)) { System.out.println("Poftiti la masa!"); }else {
		 * System.out.println("Mai asteptati!"); } }else {
		 * System.out.println("Mai asteptati!"); }
		 */
		
		
		Masa masa2 = new Masa(100, 0);
		if(Facade.esteMasaGata(masa2)) {
			System.out.println("Poftiti la masa!");
		}else {
			System.out.println("Mai asteptati!");
		}

	}
	
	

}
