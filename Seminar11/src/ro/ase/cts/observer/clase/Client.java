package ro.ase.cts.observer.clase;

public class Client implements Observer {

	private String nume;
	private String mesaj;
	
	


	public Client(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void primesteNotificare() {
		System.out.println("Clientul" + nume +  "primeste notificarea" + mesaj);
		
	}

	@Override
	public void add(Observer observer) {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
