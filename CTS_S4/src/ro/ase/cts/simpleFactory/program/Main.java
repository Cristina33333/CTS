package ro.ase.cts.simpleFactory.program;

import ro.ase.cts.simpleFactory.clase.Factory;
import ro.ase.cts.simpleFactory.clase.FactorySingleton;
import ro.ase.cts.simpleFactory.clase.Jucator;
import ro.ase.cts.simpleFactory.clase.TipJucator;

public class Main {
	
	public static void main (String[] args) {
		Factory factory = new Factory();
		Jucator portar = factory.getJucator(TipJucator.PORTAR, "portar", 20);
		Jucator fundas = factory.getJucator(TipJucator.FUNDAS, "fundas", 25);
		System.out.println(portar.toString());
		System.out.println(fundas.toString());
		
		
		FactorySingleton factorySingleton = FactorySingleton.getInstance();
		Jucator portar1 = factorySingleton.getJucator(TipJucator.PORTAR, "portar2", 30);
	}

}
