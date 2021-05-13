package ro.ase.cts.template.clase;

public class SpectatorCuHandicap extends TemplateIntrareStadion {
private String nume;

@Override
public void asezareCoada() {
	System.out.println("Spectatorul" + nume + "a fost preluat de la coada");
	
}

@Override
public void prezentareBilet() {
	System.out.println("Spectatorul" + nume + "a fost prezentat biletul");
	
}

@Override
public void controlCorporal() {
	System.out.println("Spectatorul si caruciorul" + nume + "au fost controlate");
	
}

@Override
public void ocupareLoc() {
	System.out.println("Spectatorul" + nume + "a ocupat locul special");
}

public SpectatorCuHandicap(String nume) {
	super();
	this.nume = nume;
}


}
