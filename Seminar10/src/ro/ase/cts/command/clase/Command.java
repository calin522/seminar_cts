package ro.ase.cts.command.clase;

public abstract class Command {
 private ContBancar cont;
 private float suma;
 


public Command(ContBancar cont, float suma) {
	super();
	this.cont = cont;
	this.suma = suma;
}


public ContBancar getCont() {
	return cont;
}


public void setCont(ContBancar cont) {
	this.cont = cont;
}


public float getSuma() {
	return suma;
}


public void setSuma(float suma) {
	this.suma = suma;
}


public abstract void executa();
 
}
