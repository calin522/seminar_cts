package ro.ase.cts.decorator.clase;

public class DecoratorMesajLaMultiAni extends DecoratorAbstract {

	public DecoratorMesajLaMultiAni(BiletAbstract biletAbstract) {
		super(biletAbstract);

	}
	
	@Override
	public void rezervaBilet() {
		super.rezervaBilet();
		System.out.println("La multi ani " + ((Bilet)super.getBiletAbstract()).getNumeGazda());
	}


}
