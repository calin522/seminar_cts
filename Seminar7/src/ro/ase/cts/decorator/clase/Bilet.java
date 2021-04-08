package ro.ase.cts.decorator.clase;

public class Bilet implements BiletAbstract {
	private String numeGazda;
	private String numeOaspeti;
	private String numeClient;

	public Bilet(String numeGazda, String numeOaspeti, String numeClient) {
		super();
		this.numeGazda = numeGazda;
		this.numeOaspeti = numeOaspeti;
		this.numeClient = numeClient;
	}

	public String getNumeGazda() {
		return numeGazda;
	}

	public void setNumeGazda(String numeGazda) {
		this.numeGazda = numeGazda;
	}

	public String getNumeOaspeti() {
		return numeOaspeti;
	}

	public void setNumeOaspeti(String numeOaspeti) {
		this.numeOaspeti = numeOaspeti;
	}

	public String getNumeClient() {
		return numeClient;
	}

	public void setNumeClient(String numeClient) {
		this.numeClient = numeClient;
	}

	public void rezervaBilet() {
		System.out.println(numeClient + " are bilet la meciul " + numeGazda + "-" + numeOaspeti);
	}
}
