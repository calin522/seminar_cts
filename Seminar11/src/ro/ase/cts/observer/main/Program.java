package ro.ase.cts.observer.main;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.ManagerSala;
import ro.ase.cts.observer.clase.Observer;
import ro.ase.cts.observer.clase.Subiect;

public class Program {
    public static void main(String[] args) {

        ManagerSala managerSala = new ManagerSala();

        Observer client1 = new Client("Andrei");
        Observer client2 = new Client("Calin");
        managerSala.adaugaObserver(client2);
        managerSala.adaugaObserver(client1);

        managerSala.anuntaMeciFotbal();
        managerSala.stergereObserver(client1);
        System.out.println();
        managerSala.anuntaMeciFotbal();

    }
}