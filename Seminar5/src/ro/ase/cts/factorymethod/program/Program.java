package ro.ase.cts.factorymethod.program;

import ro.ase.cts.factorymethod.clase.Jucator;
import ro.ase.cts.factorymethod.clase.Factory;
import ro.ase.cts.factorymethod.clase.FactoryAtacant;
import ro.ase.cts.factorymethod.clase.FactoryMijlocas;
import ro.ase.cts.factorymethod.clase.FactoryPortar;

public class Program {
	
	public static void printJucator( Factory fabrica ,String nume) {
		Jucator jucator1 = fabrica.createJucator(nume);
		System.out.println(jucator1.toString());
	}

	public static void main(String[] args) {
		printJucator(new FactoryPortar(), "Tatarusanu");
		printJucator(new FactoryAtacant(), "Andone");
		printJucator(new FactoryMijlocas(), "Stanciu");

	}

}