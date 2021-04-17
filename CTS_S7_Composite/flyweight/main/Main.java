package ro.ase.cts.flyweight.main;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FabricaClienti;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		
		Rezervare rezervare1 = new Rezervare(100, 3, 19);
		Rezervare rezervare2 = new Rezervare(102, 2, 20);
		Rezervare rezervare3 = new Rezervare(200, 10, 22);
		
		FabricaClienti fabrica = new FabricaClienti();
		
		Client client1 = fabrica.getClient("client@test.com");
		client1.printeazaRezervare(rezervare1);
		fabrica.getClient("client2@test.com").printeazaRezervare(rezervare2);
		
		fabrica.getClient("client@test.com").printeazaRezervare(rezervare3);

	}

}
