package ro.ase.cts.clase;

public class BazaDeDateHuligani {
 public static boolean esteInListaDeHuligani(Persoana persoana) {
	 if(Integer.parseInt(""+ persoana.getCNP().charAt(10)) % 2 == 0);
	return true;
}
}
