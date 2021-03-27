package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.AbstractPrototype;
import ro.ase.cts.prototype.clase.Bilet;
import ro.ase.cts.prototype.clase.ClientStadion;

public class Main {

	public static void main(String[] args) {
		
		AbstractPrototype client = new ClientStadion("Cristina", 25);
		
		AbstractPrototype clona = client.copiaza();
		
		ClientStadion clientStadion = (ClientStadion) client.copiaza();
		clientStadion.setDenumire("Denumire Noua");
		System.out.println(client.toString());
		System.out.println(clona.toString());
		System.out.println(clientStadion.toString());
		
		
		
		Bilet bilet = new Bilet(1, "echipa1", "echipa2", "27 martie, ora 10:00");
		Bilet bilet2 = (Bilet) bilet.copiaza();
		bilet2.setCod(2);
		System.out.println(bilet.toString());
		System.out.println(bilet2.toString());
		
		
	}

}
