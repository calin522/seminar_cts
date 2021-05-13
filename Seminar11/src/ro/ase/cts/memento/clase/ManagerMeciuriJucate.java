package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMeciuriJucate {
private List<Memento> backupuri;

public ManagerMeciuriJucate() {
    this.backupuri = new ArrayList<>();
}

public void adaugaMemento(Memento memento) {
	backupuri.add(memento);
}

public Memento getMemento(int pozitieMemento){
    if(pozitieMemento < backupuri.size())
        return backupuri.get(pozitieMemento);
    else{
        throw new IndexOutOfBoundsException();
    }
}

public ManagerMeciuriJucate(List<Memento> backupuri) {
	super();
	this.backupuri = backupuri;
}

}
