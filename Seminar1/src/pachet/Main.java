package pachet;

import Clase.Giraffe;
import Clase.Zoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zoo zoo = new Zoo();
		Giraffe g1 = new Giraffe("Maia", 300);
		Giraffe g2 = new Giraffe("Lola");
		
		zoo.addAnimal(g1);
		zoo.addAnimal(g2);
		zoo.feedAllAnimals();
	}

}
