package ro.ase.cts.observer.main;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.ManagerSala;
import ro.ase.cts.observer.clase.Subiect;

public class Program {

	public static void main(String[] args) {
		Subiect manager = new ManagerSala();
		Client client1 = new Client("Andrei");
		Client client2 = new Client("Radu");
		Client client3 = new Client("Costel");
		
		manager.adaugaObserver(client2);
		manager.adaugaObserver(client1);
		manager.adaugaObserver(client3);
		
//		manager.anuntaMeciFotbal();

	}

}
