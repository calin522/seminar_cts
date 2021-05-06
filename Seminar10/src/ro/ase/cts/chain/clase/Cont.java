package ro.ase.cts.chain.clase;

public abstract class Cont {
  private String detinator;
  private float sold;
  private Cont succesor;
  
  public void setSuccesor(Cont succesor) {
	  this.succesor = succesor;
	  
  }
  
  public abstract void realizeazaPlata(float suma);

public Cont(String detinator, float sold) {
	super();
	this.detinator = detinator;
	this.sold = sold;
	this.succesor=null;
}

public String getDetinator() {
	return detinator;
}

public float getSold() {
	return sold;
}

public Cont getSuccesor() {
	return succesor;
}

public void setDetinator(String detinator) {
	this.detinator = detinator;
}

public void setSold(float sold) {
	this.sold = sold;
}


  
  
}
