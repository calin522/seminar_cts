package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Subiect {
 private List<Observer> observeri;
 
 public Subiect() {
	 super();
	 this.observeri = new ArrayList<>();
 }
 
 public void adaugaObserver(Observer observer) {
	 observer.add(observer);
 }
 
 public void stergeObserver(Observer observer) {
	 observeri.remove(observer);
 }
 
 public void notificaClienti(String mesaj) {
	 for(Observer observer:observeri) {
		 observer.primesteNotificare();
	 }
 }
 
}
