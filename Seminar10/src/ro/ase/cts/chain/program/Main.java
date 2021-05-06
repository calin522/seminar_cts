package ro.ase.cts.chain.program;

import ro.ase.cts.chain.clase.Cont;
import ro.ase.cts.chain.clase.ContCredit;
import ro.ase.cts.chain.clase.ContCurent;
import ro.ase.cts.chain.clase.ContEconomii;
import ro.ase.cts.chain.clase.ContIndisponibil;

public class Main {

	public static void main(String[] args) {
		Cont contCurent = new ContCurent("Calin", 60);
		Cont contEconomii = new ContEconomii("Calin", 200);
		Cont contCredit = new ContCredit("Calin", 100);
		Cont contIndisponibil = new ContIndisponibil("Calin");

		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(contIndisponibil);
		
		contCurent.realizeazaPlata(100);
		contCurent.realizeazaPlata(300);
		contCurent.realizeazaPlata(800);
		
	}

}
