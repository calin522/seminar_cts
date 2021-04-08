package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Bilet;
import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorCuMesajSustinere;
import ro.ase.cts.decorator.clase.DecoratorMesajLaMultiAni;

public class Main {

	public static void main(String[] args) {
		Bilet bilet = new Bilet("Steaua", "Rapid", "Andrei");
		bilet.rezervaBilet();

		System.out.println("---------------------------------------");

		DecoratorCuMesajSustinere decorator1 = new DecoratorCuMesajSustinere(bilet);
		decorator1.rezervaBilet();

		System.out.println("---------------------------------------");

		DecoratorMesajLaMultiAni decorator2 = new DecoratorMesajLaMultiAni(bilet);
		decorator2.rezervaBilet();
		
		System.out.println("---------------------------------------");

		DecoratorAbstract decorator3 = new DecoratorMesajLaMultiAni(decorator1);
		decorator3.rezervaBilet();
		
	}

}
