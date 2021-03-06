package ro.ase.cts.composite.clase;

public abstract class ComponentaMeniu {
	
	private String nume;
	
	public abstract void afisareDescriere();
	
	public abstract ComponentaMeniu getComponenta(int pozitie) throws Exception;
	
	public abstract void adugaComponenta(ComponentaMeniu componenta);
	
	public abstract void stergeComponenta(ComponentaMeniu componenta);

	public ComponentaMeniu(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}
	
	

}
