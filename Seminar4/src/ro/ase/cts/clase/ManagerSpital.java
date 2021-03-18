package ro.ase.cts.clase;

public class ManagerSpital {
	private String nume;
	private int varsta;
	private int marca;
	
	private static ManagerSpital manager = new ManagerSpital("Georgel", 58, 3298);
	
	public static ManagerSpital getInstance() {
		return manager;
	}

	private ManagerSpital(String nume, int varsta, int marca) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.marca = marca;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void setMarca(int marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ManagerSpital [nume=");
		builder.append(nume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", marca=");
		builder.append(marca);
		builder.append("]");
		return builder.toString();}
}
