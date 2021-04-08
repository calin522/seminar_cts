package ro.ase.cts.clase;

public class Politie {
public static boolean esteUrmarita(Persoana persoana) {
	if(Integer.parseInt(""+ persoana.getCNP().charAt(12)) % 2 == 0)
		
		return true;
	return false;
}
}
