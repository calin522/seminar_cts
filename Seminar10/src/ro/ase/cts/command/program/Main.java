package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.ComandaConstituire;
import ro.ase.cts.command.clase.ComandaDepunere;
import ro.ase.cts.command.clase.ComandaRetragere;
import ro.ase.cts.command.clase.ContBancar;
import ro.ase.cts.command.clase.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		ContBancar cont = new ContBancar("Andrei");
		ManagerComenzi manager = new ManagerComenzi();
		manager.invoca(new ComandaConstituire(cont, 70));
		manager.invoca(new ComandaDepunere(cont, 20));
		manager.executaComanda();
		manager.invoca(new ComandaRetragere(cont, 9000));
		manager.executaComanda();
		manager.executaComanda();

	}

}
