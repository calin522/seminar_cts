package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMeciuriJucate;
import ro.ase.cts.memento.clase.MeciJucat;

public class Main {
    public static void main(String[] args) {
        MeciJucat meciJucat = new MeciJucat(200, "Rapid", "Steaua", 300, 700, 10000);
        ManagerMeciuriJucate managerMeciuriJucate = new ManagerMeciuriJucate();
        managerMeciuriJucate.adaugaMemento(meciJucat.salvareInformatii());

        meciJucat.setNrSpectatori(300);
        meciJucat.setEchipaGazde("Chiajna");
        meciJucat.setEchipaOaspeti("Chindia Targoviste");
        managerMeciuriJucate.adaugaMemento(meciJucat.salvareInformatii());

        System.out.println(meciJucat.toString());

        meciJucat.revenire(managerMeciuriJucate.getMemento(0));
        System.out.println(meciJucat.toString());

    }
}


