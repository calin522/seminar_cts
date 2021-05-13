package ro.ase.cts.observer.clase;

public class ManagerSala extends Subiect {
     
	public void anuntaMeciBaschet() {
		super.notificaClienti("A fost programat un meci de baschet");
	}
	public void anuntaMeciHandbal() {
		super.notificaClienti("A fost programat un meci de handbal");
	}
	public void anuntaMeciFotbal() {
		super.notificaClienti("A fost programat un meci de fotbal");
	}
}
