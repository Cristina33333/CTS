package ro.ase.cts.facade.clase;

public class Facade {
	public static boolean esteMasaGata(Masa masa) {
		if(OperatorMese.esteLibera(masa)) {
			Picolo marius = new Picolo("Marius");
			if (marius.esteDebarasta(masa) && marius.esteAranjata(masa)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}
