package ro.ase.cts.factorymethod.program;

import ro.ase.cts.factorymethod.clase.Jucator;
import ro.ase.cts.factorymethod.clase.Factory;
import ro.ase.cts.factorymethod.clase.FactoryAtacant;
import ro.ase.cts.factorymethod.clase.FactoryPortar;

public class Program {
    public static void printJucator(Factory factory, String nume) {
    	Jucator jucator1=factory.createJucator(nume);
    	System.out.println(jucator1);
    }
    public static void main(String[] args) {

    	printJucator( new FactoryPortar(),"Ionel");
    	printJucator( new FactoryAtacant(),"Dica");
    }
}
