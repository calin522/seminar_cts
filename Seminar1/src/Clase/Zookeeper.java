package Clase;

public class Zookeeper {

	private String name;

	public Zookeeper(String name) {
		super();
		this.name = name;
	}

	public void feed(Animal a) {
		System.out.println(name + "hraneste animalul " + a.getName());
	}

}
