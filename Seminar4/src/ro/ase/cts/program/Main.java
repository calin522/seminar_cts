package ro.ase.cts.program;

import ro.ase.cts.clase.ManagerSpital;
import ro.ase.cts.clase.ManagerSpitalLazy;

public class Main {
	public static void main(String[] args) {
		ManagerSpital m1 = ManagerSpital.getInstance();
		ManagerSpital m2 = ManagerSpital.getInstance();

		System.out.println(m1.toString());
		System.out.println(m2.toString());

		ManagerSpitalLazy managerLazy1 = ManagerSpitalLazy.getInstance("Ionel", 50, 2421);
		ManagerSpitalLazy managerLazy2 = ManagerSpitalLazy.getInstance("Sorina", 45, 2314);

		managerLazy1.setVarsta(70);
		managerLazy2.setNume("Maria");

		System.out.println(managerLazy1.toString());
		System.out.println(managerLazy2.toString());
	}
}
