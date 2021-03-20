package ro.ase.cts.singleton.program;

import ro.ase.cts.singleton.elefant.Elefant;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Elefant elefant1 = Elefant.getInstance(50, 1000,"Jumbo", "Africa");
	Elefant elefant2 = Elefant.getInstance(70, 5000, "Floppy", "Egipt");
	
	System.out.println(elefant1.toString());
	System.out.println(elefant2.toString());
	
	}

}
