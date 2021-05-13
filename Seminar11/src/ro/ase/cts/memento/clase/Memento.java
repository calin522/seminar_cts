package ro.ase.cts.memento.clase;

public class Memento {
	private int nrSpectatori;
	private String echipaGazde;
	private String echipaOaspeti;

	public int getNrSpectatori() {
		return nrSpectatori;
	}

	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}

	public String getEchipaGazde() {
		return echipaGazde;
	}

	public void setEchipaGazde(String echipaGazde) {
		this.echipaGazde = echipaGazde;
	}

	public String getEchipaOaspeti() {
		return echipaOaspeti;
	}

	public void setEchipaOaspeti(String echipaOaspeti) {
		this.echipaOaspeti = echipaOaspeti;
	}

	public Memento(int nrSpectatori, String echipaGazde, String echipaOaspeti) {
		super();
		this.nrSpectatori = nrSpectatori;
		this.echipaGazde = echipaGazde;
		this.echipaOaspeti = echipaOaspeti;
	}

}
