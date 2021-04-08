package ro.ase.cts.clase;

public class Bilet {
private String nume;
private String loc;
public Bilet(String nume, String loc) {
	super();
	this.nume = nume;
	this.loc = loc;
}
public String getNume() {
	return nume;
}
public void setNume(String nume) {
	this.nume = nume;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
@Override
public String toString() {
	return "Bilet [nume=" + nume + ", loc=" + loc + "]";
}


}
