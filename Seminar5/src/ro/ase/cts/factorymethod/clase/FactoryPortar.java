package ro.ase.cts.factorymethod.clase;

public class FactoryPortar implements Factory {

	@Override
	public Jucator createJucator(String nume) {
		// TODO Auto-generated method stub
		return new Portar(nume);
	}

}
