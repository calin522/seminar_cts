package ro.ase.cts.observer.clase;

public class Client implements Observer {

    private String nume;


    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("CLientul " + nume + " a primit notificarea " + mesaj);
    }
}
