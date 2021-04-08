package ro.ase.cts.program;

import ro.ase.cts.clase.BazaDeDateHuligani;
import ro.ase.cts.clase.Bilet;
import ro.ase.cts.clase.Facade;
import ro.ase.cts.clase.Persoana;
import ro.ase.cts.clase.Politie;

public class Main {
 public static void main(String[] args) {
	 Persoana p1= new Persoana("Adi", "122190240198211");
	Bilet b1 = new Bilet("Adi","2B");
	System.out.println(p1);
	System.out.println(b1);
	
	 if(p1.getNume().equals(b1.getNume())) {
		 if(!Politie.esteUrmarita(p1)) {
			 if(!BazaDeDateHuligani.esteInListaDeHuligani(p1)) {
				 System.out.println("Puteti sa intrati");
			 }
		 }
	 }
	 
	 Persoana p2= new Persoana("Maria", "122240240178244");
		Bilet b2 = new Bilet("Adi","7B");
		
		if(Facade.sePermiteAccesulPeStadion(p2,b2))
        {
            System.out.println("Poftiti!");
        }else {
            System.out.println("Ne pare rau, nu aveti voie!");
        }
 }
}
