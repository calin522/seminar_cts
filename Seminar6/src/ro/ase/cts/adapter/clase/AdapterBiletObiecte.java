package ro.ase.cts.adapter.clase;

public class AdapterBiletObiecte implements BiletOnline {
	
	private Bilet bilet;
	
	

	public AdapterBiletObiecte(Bilet bilet) {
		super();
		this.bilet = bilet;
	}
	@Override
	public void vindeBilet() {
		bilet.vinde();
	}
	@Override
	public void rezervaBilet() {

		bilet.rezerva();
	}
       
}
