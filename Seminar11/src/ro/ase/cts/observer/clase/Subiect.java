package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {

    private List<Observer> observers;

    public Subiect() {
        this.observers = new ArrayList<>();
    }

    public void adaugaObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void stergereObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notificaClienti(String mesaj) {
        for (Observer observer : observers) {
            observer.primesteNotificare(mesaj);
        }
    }
}
