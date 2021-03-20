package ro.ase.cts.singleton.lazy.program;

import ro.ase.cts.singleton.lazy.AsigurareMedicala;

public class MainClass {

	public static void main(String[] args) {
		
		AsigurareMedicala asigurare1 = AsigurareMedicala.getInstance(1, 200, "Test");
		AsigurareMedicala asigurare2 = AsigurareMedicala.getInstance(2, 1000, "Cristina");
		
		System.out.println(asigurare1.toString());
		System.out.println(asigurare2.toString());
	}

}
