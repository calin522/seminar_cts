package ro.ase.cts.decorator.clase;

public class DecoratorAbstract implements BiletAbstract {
	private BiletAbstract biletAbstract;

	public DecoratorAbstract(BiletAbstract biletAbstract) {
		super();
		this.biletAbstract = biletAbstract;
	}

	@Override
	public void rezervaBilet() {
		biletAbstract.rezervaBilet();
	}

	public BiletAbstract getBiletAbstract() {
		return biletAbstract;
	}

	public void setBiletAbstract(BiletAbstract biletAbstract) {
		this.biletAbstract = biletAbstract;
	}

}
