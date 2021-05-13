package ro.ase.cts.memento.clase;

public class MeciJucat {
	private int nrSpectatori;
	private String echipaGazde;
	private String echipaOaspeti;
	private int nrSticleApeVandute;
	private int nrBileteVandute;
	private int nrJandarmi;


	



	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}



	public void setEchipaGazde(String echipaGazde) {
		this.echipaGazde = echipaGazde;
	}



	public void setEchipaOaspeti(String echipaOaspeti) {
		this.echipaOaspeti = echipaOaspeti;
	}



	public void setNrSticleApeVandute(int nrSticleApeVandute) {
		this.nrSticleApeVandute = nrSticleApeVandute;
	}



	public void setNrBileteVandute(int nrBileteVandute) {
		this.nrBileteVandute = nrBileteVandute;
	}



	public void setNrJandarmi(int nrJandarmi) {
		this.nrJandarmi = nrJandarmi;
	}





	public int getNrSpectatori() {
		return nrSpectatori;
	}

	public String getEchipaGazde() {
		return echipaGazde;
	}

	public String getEchipaOaspeti() {
		return echipaOaspeti;
	}

	public int getNrSticleApeVandute() {
		return nrSticleApeVandute;
	}

	public int getNrBileteVandute() {
		return nrBileteVandute;
	}

	public int getNrJandarmi() {
		return nrJandarmi;
	}

	public Memento salvareInformatii() {
		Memento memento = new Memento(nrSpectatori, echipaGazde, echipaOaspeti);
		return memento;
	}

	public void revenire(Memento memento) {
		this.nrSpectatori = memento.getNrSpectatori();
		this.echipaGazde = memento.getEchipaGazde();
		this.echipaOaspeti = memento.getEchipaOaspeti();
	}

	


	public MeciJucat(int nrSpectatori, String echipaGazde, String echipaOaspeti, int nrSticleApeVandute,
			int nrBileteVandute, int nrJandarmi) {
		super();
		this.nrSpectatori = nrSpectatori;
		this.echipaGazde = echipaGazde;
		this.echipaOaspeti = echipaOaspeti;
		this.nrSticleApeVandute = nrSticleApeVandute;
		this.nrBileteVandute = nrBileteVandute;
		this.nrJandarmi = nrJandarmi;
	}



	@Override
	public String toString() {
		return "MeciJucat [ nrSpectatori=" + nrSpectatori + ", echipaGazde=" + echipaGazde
				+ ", echipaOaspeti=" + echipaOaspeti + ", nrSticleApeVandute=" + nrSticleApeVandute
				+ ", nrBileteVandute=" + nrBileteVandute + ", nrJandarmi=" + nrJandarmi + "]";
	}
	
	
}
