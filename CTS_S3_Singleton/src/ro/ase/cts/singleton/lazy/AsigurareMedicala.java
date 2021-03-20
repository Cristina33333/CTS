package ro.ase.cts.singleton.lazy;


public class AsigurareMedicala {
	
	private int id;
	private float contributie;
	private String nume;
	
	private static AsigurareMedicala asigurareMedicala = null;
	
	private AsigurareMedicala(int id, float contributie, String nume) {
		super();
		this.id = id;
		this.contributie = contributie;
		this.nume = nume;
	}

	public static AsigurareMedicala getInstance(int id, float contributie, String nume) {
		if(asigurareMedicala == null) {
				asigurareMedicala = new AsigurareMedicala(id, contributie, nume);
		}
		
		return asigurareMedicala;
	}

	public void setId(int id) {
		this.id = id;
	}


	public void setContributie(float contributie) {
		this.contributie = contributie;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AsigurareMedicala [id=");
		builder.append(id);
		builder.append(", contributie=");
		builder.append(contributie);
		builder.append(", nume=");
		builder.append(nume);
		builder.append("]");
		return builder.toString();
	}
	
	

}
