package ro.ase.cts.template.main;

import ro.ase.cts.template.clase.SpectatorCuHandicap;
import ro.ase.cts.template.clase.SpectatorUzual;
import ro.ase.cts.template.clase.TemplateIntrareStadion;

public class Main {

	public static void main(String[] args) {
		TemplateIntrareStadion spectatorUzual = new SpectatorUzual("Asher");
		spectatorUzual.intrareStadion();
		
		TemplateIntrareStadion spectatorCuHandicap = new SpectatorCuHandicap("Calin");
		spectatorCuHandicap.intrareStadion();

	}

}
