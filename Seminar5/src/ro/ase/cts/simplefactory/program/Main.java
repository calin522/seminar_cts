package ro.ase.cts.simplefactory.program;

import ro.ase.cts.simplefactory.clase.Factory;
import ro.ase.cts.simplefactory.clase.TipJucator;
import ro.ase.cts.simplefactory.clase.Jucator;

public class Main {
    public static void main(String args[]) {
    	try {
//    	  	Factory factory=new Factory();
    	    Jucator jucator1=Factory.createJucator(TipJucator.Fundas, "Calin");
    	    Jucator jucator2=Factory.createJucator(TipJucator.Portar, "Andrei");
    	    System.out.println(jucator1.toString());
    	    System.out.println(jucator2.toString());
    	}
     catch(Exception e) {
    	 e.printStackTrace();
     }
    }
}
